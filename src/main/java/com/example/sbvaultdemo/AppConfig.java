package com.example.sbvaultdemo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("app-config")
@Data
public class AppConfig {
    private String username;
    private String password;
}
