package com.example.quartz.dao;

import com.example.quartz.model.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MyUserRepository extends JpaRepository<MyUser,Integer> {

    MyUser findByAccount(String account);


}
