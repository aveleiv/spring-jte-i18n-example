package io.github.aveleiv.jte.i18n.example

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller("/")
class WelcomeController {

    @GetMapping
    fun index(model: Model): String {
        model["welcome"] = "Welcome!"
        model["hello"] = "Hello, User!"
        return "index"
    }
}