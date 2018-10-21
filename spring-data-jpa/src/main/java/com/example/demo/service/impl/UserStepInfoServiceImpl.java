package com.example.demo.service.impl;


import com.example.demo.dao.UserStepInfoRepository;
import com.example.demo.entity.UserStepInfo;
import com.example.demo.service.UserStepInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Date;
import java.util.List;

@Service
public class UserStepInfoServiceImpl implements UserStepInfoService {
    @Resource
    private UserStepInfoRepository userStepInfoRepository;

    @Override
    public void saveInfo(UserStepInfo stepInfo) {
        userStepInfoRepository.save(stepInfo);
    }


    @Override
    public UserStepInfo getInfo(String account) {
        return userStepInfoRepository.findByAccount(account);
    }

    @Override
    public List<UserStepInfo> findAllByDate(Date date) {
        return userStepInfoRepository.findAllByDate(date);
    }


}
