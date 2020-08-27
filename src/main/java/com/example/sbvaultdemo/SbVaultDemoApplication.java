package com.example.sbvaultdemo;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppConfig.class)
@Slf4j
public class SbVaultDemoApplication implements CommandLineRunner {
    private final AppConfig configuration;

    public SbVaultDemoApplication(AppConfig configuration) {
        this.configuration = configuration;
    }

    public static void main(String[] args) {
        SpringApplication.run(SbVaultDemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Assertions.assertThat(configuration.getUsername()).isNotEmpty();
        Assertions.assertThat(configuration.getPassword()).isNotEmpty();

        log.info("----------------------------------------");
        log.info("Configuration properties");
        log.info("   sb-vault-demo.username is {}", configuration.getUsername());
        log.info("   sb-vault-demo.password is {}", configuration.getPassword());
        log.info("----------------------------------------");
    }
}
