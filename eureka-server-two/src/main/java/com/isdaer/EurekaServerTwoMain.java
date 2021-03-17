package com.isdaer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerTwoMain {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerTwoMain.class,args);
    }
}
