package com.umur;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class RabbitMqConsumer1Application {
    public static void main(String[] args) {
        SpringApplication.run(RabbitMqConsumer1Application.class,args);
    }
}
