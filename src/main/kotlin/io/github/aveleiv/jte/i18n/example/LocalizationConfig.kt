package io.github.aveleiv.jte.i18n.example

import org.springframework.context.MessageSource
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.support.ResourceBundleMessageSource
import org.springframework.web.servlet.LocaleResolver
import org.springframework.web.servlet.i18n.CookieLocaleResolver
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor
import java.util.*

@Configuration
class LocalizationConfig {
    @Bean
    fun messageSource(): MessageSource {
        return ResourceBundleMessageSource().apply {
            setBasenames("i18n/messages")
            setDefaultEncoding("UTF-8")
        }
    }

    @Bean
    fun localeResolver(): LocaleResolver {
        return CookieLocaleResolver().apply {
            setDefaultLocale(Locale.ENGLISH)
            defaultTimeZone = TimeZone.getTimeZone("UTC")
        }
    }

    @Bean
    fun localeChangeInterceptor(): LocaleChangeInterceptor {
        return LocaleChangeInterceptor().apply {
            paramName = "lang"
        }
    }
}