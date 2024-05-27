package com.example.demo

import mu.KotlinLogging
import org.springframework.stereotype.Component
import java.util.function.Consumer

@Component
class SampleConsumer : Consumer<String> {
    override fun accept(t: String) {
        logger.info { "Consumer: $t" }
    }
}

private val logger = KotlinLogging.logger {}
