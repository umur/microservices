package com.umur.service;

import com.umur.entity.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductService {

    Mono<Product> findById(int id);

    Flux<Product> findAll();

}
