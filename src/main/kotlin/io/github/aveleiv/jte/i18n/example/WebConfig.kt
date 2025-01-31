package io.github.aveleiv.jte.i18n.example

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor

@Configuration
class WebConfig(
    private val localeChangeInterceptor: LocaleChangeInterceptor,
    private val modelLocalizationInterceptor: LocalizationConfig.ModelLocalizationInterceptor
) : WebMvcConfigurer {
    override fun addInterceptors(registry: InterceptorRegistry) {
        registry.addInterceptor(localeChangeInterceptor)
        registry.addInterceptor(modelLocalizationInterceptor)
    }
}