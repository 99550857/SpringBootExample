package com.example.quartz.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.quartz.dao.MyUserRepository;
import com.example.quartz.model.MyUser;
import com.example.quartz.service.MyUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MyUserServiceImpl implements MyUserService {

    @Resource
    MyUserRepository myUserRepository;

    @Override
    public MyUser getInfo(String account) {
        return myUserRepository.findByAccount(account);
    }

    @Override
    public Integer confirmAccount(String account, String password) {
        if(getInfo(account)==null){
            return 1;
        }else {
            String p = getInfo(account).getPassword();

            if (p.equals(password)){
                return 0;
            }else {
                return 2;
            }
        }
    }

    @Override
    public String getAll() {
        List<MyUser> list = myUserRepository.findAll();
        Map map = new HashMap();
        map.put("list",list);
        JSONObject jsonObject = new JSONObject(map);

        return "data:{"+jsonObject.toJSONString()+"}";
    }
}
