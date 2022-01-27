package com.ofa.consolidateMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ConsolidateMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsolidateMsApplication.class, args);
    }

}
