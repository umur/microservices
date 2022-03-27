package com.umur.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloQueue {

    @Bean
    public Queue hiQueue() {
        return new Queue("hello-queue", true);
    }

    @Bean
    FanoutExchange exchange() {
        return new FanoutExchange("hello-fanout-exchange");
    }

    @Bean
    Binding helloQueueBinding(Queue hiQueue, FanoutExchange helloFanoutExchange) {
        return BindingBuilder.bind(hiQueue).to(helloFanoutExchange);
    }


}
