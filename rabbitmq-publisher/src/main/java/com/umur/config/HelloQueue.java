package com.umur.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloQueue {

    @Bean
    public Queue hiQueue1() {
        return new Queue("hello-queue-1", true);
    }

    @Bean
    public Queue hiQueue2() {
        return new Queue("hello-queue-2", true);
    }

    @Bean
    FanoutExchange exchange() {
        return new FanoutExchange("hello-fanout-exchange");
    }

    @Bean
    Binding helloQueue1Binding(Queue hiQueue1, FanoutExchange helloFanoutExchange) {
        return BindingBuilder.bind(hiQueue1).to(helloFanoutExchange);
    }

    @Bean
    Binding helloQueue2Binding(Queue hiQueue2, FanoutExchange helloFanoutExchange) {
        return BindingBuilder.bind(hiQueue2).to(helloFanoutExchange);
    }

}
