# Example of Internationalization in Spring application using JTE

[Medium article](https://medium.com/@leonidivakhnenko/internationalization-with-jte-and-spring-boot-3-979a939f6ccb)

This repo stores an example of i18n in Spring application with Java Template Engine. 
Tags separate stages of progression from the beginning to the end:
- **no-i18n**: base application with template page displaying a welcome message
- **controller-localization**: messages localized in controller and passed to template
- **template-localization**: configuration of additional localization beans and delegating message retrieval to templates 

## Run

Java version 21 or later required for build and execution.

Start application with command in project root:
```shell
./gradlew bootRun
```

Web page will be available on `localhost:8080`