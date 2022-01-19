package com.ddh.apollo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApolloController {

    private static Logger logger = LoggerFactory.getLogger(ApolloController.class);

    @Value("${server.port}")
    private String port;

    @Value("${address}")
    private String ipAddress;

    @GetMapping("hi")
    public String hi(String name) {

        logger.debug("debug log...");
        logger.info("info log...");
        logger.warn("warn log...");

        return "hi " + name + " ,i am from port:" + port +", ip address is: "+ ipAddress;
    }
}
