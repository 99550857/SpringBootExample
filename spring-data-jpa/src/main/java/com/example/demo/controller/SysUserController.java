package com.example.demo.controller;

import com.example.demo.entity.SysUser;
import com.example.demo.service.SysUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class SysUserController {
    @Resource
    SysUserService sysUserService;

    @GetMapping("/selAll")
    public List<SysUser> getByNickname() {
        return sysUserService.getSysUserByNickname("qqq");
    }

    @GetMapping("/selName")
    public List<SysUser> selectTest(@RequestParam(value = "nickName") String name) {
        return sysUserService.getSysUserByNickname(name);
    }

    @GetMapping("/findLike")
    public List<SysUser> findLike(@RequestParam(value = "nickName") String name) {
        return sysUserService.selTest(name);
    }

    @GetMapping("/findByAccount")
    public SysUser findByAccount(@RequestParam(value = "account") String account) {
        return sysUserService.findByAccount(account);
    }
}