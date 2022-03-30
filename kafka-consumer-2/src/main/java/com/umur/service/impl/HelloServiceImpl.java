package com.umur.service.impl;

import com.umur.service.HelloService;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {


    @KafkaListener(topics = "test3", containerFactory = "kafkaListenerStringContainerFactory",groupId = "test3")
    @Override
    public void receive(ConsumerRecord<String, String> cr, @Payload String message) {
        System.out.println(message);
    }
}
