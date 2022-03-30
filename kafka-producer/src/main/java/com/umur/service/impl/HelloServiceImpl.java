package com.umur.service.impl;

import com.umur.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private  KafkaTemplate<String, Object> kafkaTemplate;

    @Override
    public void send() {
        kafkaTemplate.send("test", "Hello: " + System.currentTimeMillis());
    }
}
