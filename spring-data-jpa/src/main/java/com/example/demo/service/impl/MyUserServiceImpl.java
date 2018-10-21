package com.example.demo.service.impl;

import com.example.demo.dao.MyUserRepository;
import com.example.demo.entity.MyUser;
import com.example.demo.service.MyUserService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * Created by 99550 on 2018/9/20.
 */
@Service
public class MyUserServiceImpl implements MyUserService {
    @Resource
    private MyUserRepository myUserRepository;

    @Override
    public MyUser save(MyUser myUser) {
        return myUserRepository.save(myUser);
    }

    @Override
    public List<MyUser> getAll() {
        return (List<MyUser>) myUserRepository.findAll();
    }

    @Override
    public void deleteMyUser(MyUser myUser) {
        myUserRepository.delete(myUser);
    }

    @Override
    public MyUser get(Integer id) {
        return myUserRepository.findById(id).get();
    }
}
