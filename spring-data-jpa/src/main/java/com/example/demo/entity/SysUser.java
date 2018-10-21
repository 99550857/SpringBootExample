package com.example.demo.entity;


import lombok.Data;
import lombok.Synchronized;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class SysUser implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;

    private String accoumt;

    private String password;

    private String nickName;

    private Integer fans;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccoumt() {
        return accoumt;
    }

    public void setAccoumt(String accoumt) {
        this.accoumt = accoumt;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getFans() {
        return fans;
    }

    public void setFans(Integer fans) {
        this.fans = fans;
    }
}
