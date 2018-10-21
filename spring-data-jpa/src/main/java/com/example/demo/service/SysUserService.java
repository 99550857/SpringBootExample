package com.example.demo.service;

import com.example.demo.entity.SysUser;

import java.util.List;

public interface SysUserService {
    List<SysUser> getSysUserByNickname(String nickname);

    void insertSysUser(SysUser sysUser);

    List<SysUser> findAll();

    List<SysUser> selTest(String nickName);


    SysUser findbyId(Integer id);

    SysUser findByAccount(String account);
}
