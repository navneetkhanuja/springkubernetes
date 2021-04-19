package com.nav.springkubernetes.job;

import com.nav.springkubernetes.config.TestConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class PrintScheduler {

    @Autowired
    TestConfiguration testConfiguration;

    @Scheduled(fixedDelay = 3000) //3 sec
    public void printMessage(){
        System.out.println("Message content is : " + testConfiguration.getMessage());
    }

}
