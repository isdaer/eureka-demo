package isdaer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProviderTwoMain {
    public static void main(String[] args) {
        SpringApplication.run(ProviderTwoMain.class, args);
    }
}
