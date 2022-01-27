package com.ofa.configurationClient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigController {

    @Value("${welcome.msg:welcome here}")
    private String welcomeMsg;


    @RequestMapping("/msg")
    String getWelcomeMsg() {
        return this.welcomeMsg;
    }

}
