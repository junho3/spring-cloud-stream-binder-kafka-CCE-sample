package com.example.demo

import org.springframework.cloud.stream.function.StreamBridge
import org.springframework.messaging.support.MessageBuilder
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleProducer(
    private val streamBridge: StreamBridge,
) {
    @GetMapping("/publish")
    fun consumer() {
        streamBridge.send(
            "sample-producer",
            MessageBuilder.withPayload("SAMPLE_MESSAGE").build(),
        )
    }
}
