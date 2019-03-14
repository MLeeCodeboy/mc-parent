package com.eureka.feign.service;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "SERVICE-HELLOWORLD",fallback = HelloworldServiceFailure.class)
public interface HelloworldService {

    @GetMapping(value= "/")
    public abstract String sayHello();
}
