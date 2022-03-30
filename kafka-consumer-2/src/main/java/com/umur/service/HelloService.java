package com.umur.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;

public interface HelloService {

    void receive(ConsumerRecord<String, String> cr, String message);

}
