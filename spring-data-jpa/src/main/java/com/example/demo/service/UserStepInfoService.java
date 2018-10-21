package com.example.demo.service;

import com.example.demo.entity.UserStepInfo;

import java.sql.Date;
import java.util.List;

public interface UserStepInfoService {

    void saveInfo(UserStepInfo stepInfo);


    UserStepInfo getInfo(String account);


    List<UserStepInfo> findAllByDate(Date date);

}
