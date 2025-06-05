package org.example.message;

import lombok.RequiredArgsConstructor;
import org.example.DTO.UserRegisteredEvent;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class MessageProducer {
    private final KafkaTemplate<String, UserRegisteredEvent> kafkaTemplate;


    public void sendMessage(UserRegisteredEvent event) {
        kafkaTemplate.send("test-topic", event.getUserId(), event);
        System.out.println("Sent message: " + event);
    }

}
