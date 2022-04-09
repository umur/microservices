package com.umur;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication  {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class,args);
    }

    @RequestMapping("/test")
    @RestController
    static class TestController{

        @GetMapping
        public String test(){
            return  "Hello From Config Server !!!";
        }
    }
}
