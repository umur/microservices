package com.umur.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table
@Data
public class Product {

    @Id
    private int id;

    private String name;
    private int price;
}
