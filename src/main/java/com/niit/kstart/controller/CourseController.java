package com.niit.kstart.controller;

import com.niit.kstart.bean.Course;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by 99550 on 2018/9/3.
 */
@RestController
public class CourseController {
    @Resource
    private Course course;

    @RequestMapping("/course")
    @ResponseBody
    public String getCourse(){

        return course.toString();
    }


}
