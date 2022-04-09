package com.umur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication  {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class,args);
    }

    @Bean
    public Docket api() {
        var apiInfo = new ApiInfoBuilder()
                .title("my-example-service")
                .version("1.0")
                .license(null)
                .licenseUrl(null)
                .termsOfServiceUrl(null)
                .description("The my-example-service to show the integration of swagger ui.")
                .build();

        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo)
                .useDefaultResponseMessages(false)
                .select()
                .apis(RequestHandlerSelectors
                        .basePackage("com.umur"))
                .paths(PathSelectors.regex("/.*"))
                .build();
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
