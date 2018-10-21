package com.example.demo.service.impl;

import com.example.demo.dao.SysUserRepository;
import com.example.demo.entity.SysUser;
import com.example.demo.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Resource
    SysUserRepository sysUserRepository;


    @Override
    public List<SysUser> getSysUserByNickname(String nickname) {
        return sysUserRepository.findAllByNickName(nickname);
    }

    @Override
    public void insertSysUser(SysUser sysUser) {

        sysUserRepository.save(sysUser);
    }

    @Override
    public List<SysUser> findAll() {
        return sysUserRepository.findAll();
    }

    @Override
    public List<SysUser> selTest(String nickName) {
        return sysUserRepository.findLike(nickName);
    }

    @Override
    public SysUser findbyId(Integer id) {
        return sysUserRepository.findbyId(id);
    }

    @Override
    public SysUser findByAccount(String account) {
        return sysUserRepository.findAllByAccoumt(account);
    }


}
