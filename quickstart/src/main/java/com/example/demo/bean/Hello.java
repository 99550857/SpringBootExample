package com.example.demo.bean;

import org.springframework.stereotype.Component;

/**
 * Created by 99550 on 2018/9/3.
 */
@Component
public class Hello {
    public String getHello() {
        return "Hello Spring Boot!";
    }
}
