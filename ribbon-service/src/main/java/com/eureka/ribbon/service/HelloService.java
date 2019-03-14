package com.eureka.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName HelloService
 * @Description TODO
 * @Author lizhitao
 * @Date 2019/3/2 17:21
 * @Version 1.0
 **/
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "serviceFailure")
    public String getHelloContent(){
        return restTemplate.getForObject("http://SERVICE-HELLOWORLD/",String.class);
    }

    public String serviceFailure(){
        return "hello world service is not availabe !";
    }
}
