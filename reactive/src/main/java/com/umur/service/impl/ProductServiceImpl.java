package com.umur.service.impl;

import com.umur.entity.Product;
import com.umur.repository.ProductRepo;
import com.umur.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;

    @Override
    public Mono<Product> findById(int id) {
       return productRepo.findById(id);
    }

    @Override
    public Flux<Product> findAll() {
       return productRepo.findAll();
    }
}
