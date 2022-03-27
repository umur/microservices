package com.umur.service;

public interface HelloConsumer {
    void bindToHelloQueue(String payload);
}
