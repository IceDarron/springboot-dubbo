package com.icedarron.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.icedarron.service.HelloService;
import org.springframework.stereotype.Component;

@Component
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {
        return "hello " + name;
    }
}