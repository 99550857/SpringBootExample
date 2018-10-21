package com.example.demo.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 99550 on 2018/9/3.
 */
@Configuration
public class Teacher {
    @Value("徐老师")
    private String name;

    @Value("Spring Boot")
    private String subject;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }

}
