package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 创建持久化类
 * 使用@Entity注解实现体类的持久化，，JPA检测后可以在数据库生成对应表
 * Created by 99550 on 2018/9/20.
 */

@Entity
@Data
public class MyUser {
    @Id
    @GeneratedValue
    private Integer id;
    private String userName;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
