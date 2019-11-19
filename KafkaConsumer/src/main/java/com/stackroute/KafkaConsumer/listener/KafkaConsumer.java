package com.stackroute.KafkaConsumer.listener;

import com.stackroute.KafkaConsumer.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "Kafka_Example1",groupId= "group_id")
    public void consume(String message){
        System.out.println("consumed message" + message);
    }

    @KafkaListener(topics ="Kafka_Example_json",groupId ="group_json",containerFactory= "userKafkaListener")
    public void consumeJson(User user){
        System.out.println("consumed JSON Message" + user);
    }
}
