package com.example.demo.service;

import com.example.demo.entity.MyUser;

import java.util.List;
import java.util.Optional;

/**
 * Created by 99550 on 2018/9/20.
 */
public interface MyUserService {

    MyUser save(MyUser myUser);

    List<MyUser> getAll();

    void deleteMyUser(MyUser myUser);

    MyUser get(Integer id);


}
