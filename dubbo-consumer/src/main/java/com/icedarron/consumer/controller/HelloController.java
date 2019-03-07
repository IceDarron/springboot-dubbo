package com.icedarron.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.icedarron.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Reference
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello() {
        String hello = helloService.hello("world");
        return hello;
    }

    @RequestMapping("/test")
    public String test() {
        return "test, successful";
    }
}
