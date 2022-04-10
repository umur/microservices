package com.umur;

import com.umur.model.Credential;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.vault.authentication.TokenAuthentication;
import org.springframework.vault.client.VaultEndpoint;
import org.springframework.vault.core.VaultTemplate;
import org.springframework.vault.support.VaultResponseSupport;

@SpringBootApplication
public class VaultApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(VaultApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        VaultTemplate vaultTemplate = new VaultTemplate(new VaultEndpoint(),
                new TokenAuthentication("00000000-0000-0000-0000-000000000000"));

        VaultResponseSupport<Credential> response = vaultTemplate.read("secret/myapp", Credential.class);
        System.out.println(response);
    }


}
