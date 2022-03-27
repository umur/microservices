package com.umur.service.impl;

import com.umur.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HelloServiceImpl implements HelloService {

    private final RabbitTemplate rabbitTemplate;
    private final Queue hiQueue;

    @Override
    public void send() {
        rabbitTemplate.convertAndSend(this.hiQueue.getName(), "Hello World: " + System.currentTimeMillis());
    }
}
