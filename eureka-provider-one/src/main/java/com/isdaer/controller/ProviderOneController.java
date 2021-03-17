package com.isdaer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderOneController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/provider/{id}")
    public String getPaymentById(@PathVariable("id") Long id) {
        return "成功获取到结果,所传id为:" + id + "提供服务端口号为:" + serverPort;
    }

}
