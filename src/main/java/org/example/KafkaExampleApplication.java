package org.example;

import org.example.DTO.UserRegisteredEvent;
import org.example.message.MessageProducer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaExampleApplication implements CommandLineRunner{
    private final MessageProducer producer;

    public KafkaExampleApplication(MessageProducer producer) {
        this.producer = producer;
    }


    public static void main(String[] args) {
        SpringApplication.run(KafkaExampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        UserRegisteredEvent event = new UserRegisteredEvent("user123", "user123@example.com");
        producer.sendMessage(event);
    }


}

