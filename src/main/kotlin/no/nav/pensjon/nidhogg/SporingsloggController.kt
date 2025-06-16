package no.nav.pensjon.nidhogg

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import javax.sql.DataSource

@Controller
class SporingsloggController(
    val dataSource: DataSource
) {

    @GetMapping("/hello")
    fun hello(): String {
        dataSource.connection.use { connection ->
        connection.prepareStatement("").execute()
        }

        return "OK"
    }
}