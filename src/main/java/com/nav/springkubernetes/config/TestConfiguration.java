package com.nav.springkubernetes.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "test")
public class TestConfiguration {

    private String message = "Default message";

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }
}
