package com.eureka.feign.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName WebController
 * @Description TODO
 * @Author lizhitao
 * @Date 2019/3/4 11:31
 * @Version 1.0
 **/
@RestController
public class WebController {
    @Autowired
    HelloworldService helloworldService;

    @GetMapping(value = "/hello")
    public String sayHello(){
        return helloworldService.sayHello();
    }
}
