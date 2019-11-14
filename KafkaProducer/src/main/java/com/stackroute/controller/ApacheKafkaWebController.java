package com.stackroute.controller;


import com.stackroute.model.KafkaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/kafka/")
public class ApacheKafkaWebController {


    @Autowired
    private KafkaTemplate<String, KafkaModel> kafkaTemplate;

    private static final String TOPIC = "KafkaExample1";

    @GetMapping("/publish/{name}")
    public String post(@PathVariable("name") final String name) {
        kafkaTemplate.send(TOPIC, new KafkaModel(name,"Tech",120000L));

        return "Message sent to the Kafka Topic Kafka_Example1 Successfully";
    }

}
