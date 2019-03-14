package com.eureka.feign.service;

import org.springframework.stereotype.Component;

/**
 * @ClassName HelloworldServiceFailure
 * @Description TODO
 * @Author lizhitao
 * @Date 2019/3/4 13:43
 * @Version 1.0
 **/
@Component
public class HelloworldServiceFailure implements HelloworldService{
    @Override
    public String sayHello() {
        return "hello world service is not available";
    }
}
