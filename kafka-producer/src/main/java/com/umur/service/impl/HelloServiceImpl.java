package com.umur.service.impl;

import com.umur.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HelloServiceImpl implements HelloService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void send() {
        kafkaTemplate.send("hello-topic", "Hello: " + System.currentTimeMillis());
    }
}
