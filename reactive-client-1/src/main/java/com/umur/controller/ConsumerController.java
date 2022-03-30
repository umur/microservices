package com.umur.controller;

import com.umur.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

// !!! FOR DEMO PURPOSES ONLY !!!

@RestController
@RequestMapping("/api/v1/consumers")
public class ConsumerController {

    private WebClient client = WebClient.create("http://localhost:5555/api/v1");

    @GetMapping
    public Flux<Product> getAllProducts() {
        var productFlux= client
                .get()
                .uri("/products")
                .retrieve()
                .bodyToFlux(Product.class);

        productFlux.subscribe(System.out::println);
        return productFlux;
    }

}
