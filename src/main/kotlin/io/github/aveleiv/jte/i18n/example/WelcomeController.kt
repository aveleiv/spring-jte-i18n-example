package io.github.aveleiv.jte.i18n.example

import org.springframework.context.MessageSource
import org.springframework.context.i18n.LocaleContextHolder
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller("/")
class WelcomeController(private val messageSource: MessageSource) {

    @GetMapping
    fun index(model: Model): String {
        val locale = LocaleContextHolder.getLocale()
        model["welcome"] = messageSource.getMessage("welcome", null, locale)
        model["hello"] = messageSource.getMessage("hello", null, locale)
        model["toEnglish"] = messageSource.getMessage("switch.en", null, locale)
        model["toUkrainian"] = messageSource.getMessage("switch.ua", null, locale)
        return "index"
    }
}