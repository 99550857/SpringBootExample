package com.example.demo.dao;

import com.example.demo.entity.MyUser;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by 99550 on 2018/9/20.
 */
public interface MyUserRepository extends CrudRepository<MyUser, Integer> {
}
