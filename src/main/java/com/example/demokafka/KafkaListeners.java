package com.example.demokafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "demokafka",
            groupId = "groupId")
    void listener(String data) {
        System.out.println("Listener received: " + data + "😛");
    }
}
