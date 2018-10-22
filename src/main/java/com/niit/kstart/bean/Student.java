package com.niit.kstart.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 99550 on 2018/9/3.
 */

@Configuration
@Data
public class Student {
    @Value("张三")
    private String name;

    @Value("#{20-2}")
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
