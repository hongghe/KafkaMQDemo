package com.hongghe.kafkamqdemo.consumergroup;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class DemoConsumer {

    private static final Logger logger = LoggerFactory.getLogger(DemoConsumer.class);

    @KafkaListener(topics = "test")
    public void consumer(String message) {
        Gson gson = new Gson();
        logger.info("[DemoConsumer][consumer]The message={}", gson.toJson(message));
    }
}
