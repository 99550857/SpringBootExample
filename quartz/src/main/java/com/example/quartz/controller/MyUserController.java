package com.example.quartz.controller;


import com.alibaba.fastjson.JSONObject;
import com.example.quartz.model.MyUser;
import com.example.quartz.service.MyUserService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController(value = "/user")
public class MyUserController {
    @Resource
    MyUserService myUserService;

    @GetMapping(value = "/confirm")
    public String confirmation(@Param("account")String account,@Param("password")String password){
        int n = myUserService.confirmAccount(account,password);
        if(n==0){
            Map map = new HashMap();
            MyUser myUser = myUserService.getInfo(account);
            map.put("account",myUser.getAccount());
            map.put("avatar",myUser.getAvatar());
            map.put("step" ,myUser.getStep());
            map.put("message" ,"获取成功");
            JSONObject jsonpObject = new JSONObject(map);

            return "data:{"+jsonpObject.toJSONString()+"}";
        }else {
            return "data:{message:账号或密码错误}";
        }
    }

    @GetMapping(value = "/all")
    public String getAll(){
        return myUserService.getAll();
    }
}
