package com.example.demo.controller;

import com.example.demo.entity.MyUser;
import com.example.demo.service.MyUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 99550 on 2018/9/20.
 */
@RestController
@RequestMapping(value = "/myUser")
public class MyUserController {
    @Resource
    private MyUserService myUserService;

    @GetMapping("/all")
    public List<MyUser> getAll() {
        return myUserService.getAll();
    }

    @GetMapping("/{id}")
    public MyUser get(@PathVariable Integer id) {
        return myUserService.get(id);
    }

}
