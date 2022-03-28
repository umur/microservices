package com.umur.service.impl;

import com.umur.service.HelloService;
import org.springframework.kafka.annotation.KafkaListener;

public class HelloServiceImpl implements HelloService {

    @KafkaListener(topics = "hello-topic", groupId = "umur")
    @Override
    public void receive(String message) {
        System.out.println(message);
    }
}
