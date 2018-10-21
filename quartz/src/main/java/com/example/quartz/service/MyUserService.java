package com.example.quartz.service;

import com.example.quartz.model.MyUser;

import java.util.List;

public interface MyUserService {

    MyUser getInfo(String account);

    Integer confirmAccount(String account,String password);

    String getAll();
 }
