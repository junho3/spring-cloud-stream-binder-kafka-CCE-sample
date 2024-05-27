package com.example.demo

import mu.KotlinLogging
import org.springframework.stereotype.Component
import java.util.function.Function

@Component
class SampleFunction : Function<String, Unit> {
    override fun apply(t: String) {
        // Function is ok.
        logger.info { "Function: $t" }
    }
}

private val logger = KotlinLogging.logger {}
