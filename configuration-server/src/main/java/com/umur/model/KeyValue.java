package com.umur.model;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class KeyValue {

    private String username;
    private String password;
}
