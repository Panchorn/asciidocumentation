package com.nonpcn.asciidocumentation

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AsciidocumentationApplication

fun main(args: Array<String>) {
    runApplication<AsciidocumentationApplication>(*args)
}
