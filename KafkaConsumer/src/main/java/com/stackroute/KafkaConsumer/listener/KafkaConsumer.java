package com.stackroute.KafkaConsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "Kafka_Example1",groupId= "group_id")
    public void consume(String message){
        System.out.println("consumed message" + message);
    }
}
