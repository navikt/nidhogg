package no.nav.pensjon.nidhogg

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NidhoggApplication

fun main(args: Array<String>) {
    runApplication<NidhoggApplication>(*args)
}
