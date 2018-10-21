package com.example.demo.bean;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by 99550 on 2018/9/3.
 */
@Component
public class Course {
    @Resource(name = "student")
    private Student student;

    @Resource(name = "teacher")
    private Teacher teacher;

    @Override
    public String toString() {
        return "Course{" +
                "学生：" + student +
                ", 老师：" + teacher +
                '}';
    }
}
