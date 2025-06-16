package no.nav.pensjon.nidhogg

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component
import javax.sql.DataSource

@Component
class SporingsloggAppender(
    val dataSource: DataSource
) {

    @KafkaListener(topics = ["pensjon-q2.sporingslogg"], groupId = "sporingslogg")
    fun listen(message: String) {
        dataSource.connection.use { connection ->
            connection.prepareStatement("INSERT INTO sporingslogg (melding) VALUES (?)").apply {
                setString(1, message)
                executeUpdate()
            }
        }
    }
}