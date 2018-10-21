package com.example.demo.service;

import com.example.demo.entity.MyUser;
import com.example.demo.service.impl.MyUserServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.swing.*;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 99550 on 2018/9/20.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyUserServiceTest {
    @Resource
    MyUserService myUserService;

    @Test
    public void save() throws Exception {
        MyUser myUser = new MyUser();

//            myUser.setUserName(String.valueOf(3));
//            myUser.setPassword("15151");
        myUserService.save(myUser);

    }

    @Test
    public void getAll() throws Exception {
        List<MyUser> list = myUserService.getAll();
        list.forEach(myUser -> System.out.println(myUser));
    }

    @Test
    public void deleteMyUser() throws Exception {

    }

    @Test
    public void get() throws Exception {

    }

}