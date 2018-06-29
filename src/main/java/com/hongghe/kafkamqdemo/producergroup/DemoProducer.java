package com.hongghe.kafkamqdemo.producergroup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class DemoProducer {

    private static final Logger logger = LoggerFactory.getLogger(DemoProducer.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void producerSend() {
        String demoMessage = "test message";
        kafkaTemplate.send("test", 1, demoMessage);
    }
}
