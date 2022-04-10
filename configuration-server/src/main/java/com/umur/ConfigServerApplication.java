package com.umur;

import com.umur.model.KeyValue;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Import;
import org.springframework.vault.config.EnvironmentVaultConfiguration;
import org.springframework.vault.core.VaultTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@Import(value = EnvironmentVaultConfiguration.class)
@RequiredArgsConstructor
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication  {

    private final VaultTemplate vaultTemplate;

    public static void main(String[] args) {
      var context=  SpringApplication.run(ConfigServerApplication.class,args);
    }

    @PostConstruct
    private void postConstruct() {
//       var response= vaultTemplate.read("/kv/data/db");
//        if(response!= null && response.getData()!=null){
//            System.out.println("My username is: " + response.getData().get("data"));
//        }

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
