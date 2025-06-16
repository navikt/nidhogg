package no.nav.pensjon.nidhogg

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.sql.DataSource

@RestController
@RequestMapping("/sporingslogg")
class SporingsloggController(
    val dataSource: DataSource
) {

    @GetMapping("/alle")
    fun hello(): String {
        return buildString {
            dataSource.connection.use { connection ->
                val resultSet = connection.prepareStatement("SELECT COUNT(1) FROM INFORMATIONSLOG").executeQuery()
                while (resultSet.next()) {
                    append {"" + resultSet.getDate(1) + " - " + resultSet.getString(2) + "\n" }
                }
            }
        }
    }
}