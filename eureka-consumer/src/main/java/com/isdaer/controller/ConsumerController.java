package com.isdaer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class ConsumerController {

    public static final String PAYMENT_URL = "http://EUREKA-PROVIDER";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/{id}")
    public String getPayment(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/provider/" + id, String.class);
    }
}
