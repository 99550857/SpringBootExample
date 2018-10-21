package com.example.demo.controller;

import com.example.demo.entity.UserStepInfo;
import com.example.demo.service.UserStepInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/stepinfo")
public class UserStepInfoController {

    @Resource
    UserStepInfoService userStepInfoService;


    @GetMapping(value = "/getStepInfo")
    public UserStepInfo getStepInfo(@RequestParam(value = "account") String account) {
        return userStepInfoService.getInfo(account);

    }
}
