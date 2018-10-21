package com.example.demo.service;

import com.example.demo.entity.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserServiceTest {
    @Resource
    private SysUserService sysUserService;

    @Test
    public void getSysUserByNickname() {
        List<SysUser> list = sysUserService.getSysUserByNickname("qqq");
        list.forEach(sysUser -> System.out.println(sysUser));
    }

    @Test
    public void saveSysUser() {
        SysUser sysUser = new SysUser();
        sysUser.setAccoumt("222");
        sysUser.setPassword("121");
        sysUser.setFans(55);
        sysUser.setNickName("qqq");
        sysUserService.insertSysUser(sysUser);

    }

    @Test
    public void findTest() {
        String name = "%?%";
        List<SysUser> list = sysUserService.selTest(name);
        list.forEach(System.out::println);
    }

    @Test
    public void findAll() {
        List<SysUser> list = sysUserService.findAll();
        list.forEach(System.out::println);
    }

    @Test
    public void findbyId() {
        System.out.println(sysUserService.findbyId(1));
    }
}