package org.example.message;

import org.example.DTO.UserRegisteredEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @KafkaListener(topics = "test-topic", groupId = "test-group", containerFactory = "kafkaListenerContainerFactory")
    public void listen(UserRegisteredEvent event) {
        System.out.println("Received message: " + event);
    }
}

