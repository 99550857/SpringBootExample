package com.example.demo.dao;

import com.example.demo.entity.UserStepInfo;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.util.List;

public interface UserStepInfoRepository extends CrudRepository<UserStepInfo, Integer> {


    UserStepInfo findByAccount(String account);

    List<UserStepInfo> findAllByDate(Date date);
}


