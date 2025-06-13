package no.nav.pensjon.nidhogg

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SporingsloggController {

    @GetMapping("/hello")
    fun hello(): String {
        return "OK"
    }
}