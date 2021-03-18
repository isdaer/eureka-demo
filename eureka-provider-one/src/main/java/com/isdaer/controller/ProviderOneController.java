package com.isdaer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ProviderOneController {

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping(value = "/provider/{id}")
    public String getPaymentById(@PathVariable("id") Long id) {
        return "成功获取到结果,所传id为:" + id + "提供服务端口号为:" + serverPort;
    }

    @GetMapping(value = "/payment/discovery")
    public Object discovery() {
        //全部微服务名称
        List<String> services = discoveryClient.getServices();//注册的微服务有哪些
        for (String element : services) {
            System.out.println("element:" + element);
        }

        //一个微服务下面的全部实例
        List<ServiceInstance> instances = discoveryClient.getInstances("EUREKA-PROVIDER");//根据微服务名称获取
        for (ServiceInstance instance : instances) {
            //id + host + port + url
            System.out.println(instance.getServiceId() + "\t" + instance.getHost() + "\t" + instance.getPort() + "\t" + instance.getUri());
        }
        return this.discoveryClient;
    }

}
