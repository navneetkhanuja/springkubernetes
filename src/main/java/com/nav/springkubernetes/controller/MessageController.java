package com.nav.springkubernetes.controller;

import com.nav.springkubernetes.config.TestConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MessageController {

    @Value("${controller.message}")
    private String testMessage;

    @Autowired
    TestConfiguration testConfiguration;

    @GetMapping("/message")
    public String getMessage(){
        return testMessage;
    }

    @GetMapping("/messageConfig")
    public String getMessageConfig(){
        return testConfiguration.getMessage();
    }

}


