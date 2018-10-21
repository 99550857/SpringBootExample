package com.example.demo.dao;

import com.example.demo.entity.SysUser;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SysUserRepository extends CrudRepository<SysUser, Integer> {
    List<SysUser> findAllByNickName(String nickName);

    @Query("SELECT u from SysUser u ")
    List<SysUser> findAll();

    @Query("select u from SysUser u where u.id=:id")
    SysUser findbyId(@Param("id") Integer id);

//@Query("select u from SysUser u where u.nickName like  concat('%',:nickname,'%') order by u.fans desc ")
    //    List<SysUser> findAllByNickNameLikeOrderByFansDesc(@Param("nickName") String nickName);

    @Query("select u from SysUser u where u.nickName like  concat('%',:nickName,'%') order by u.fans desc ")
    List<SysUser> findLike(@Param("nickName") String nickName);

    SysUser findAllByAccoumt(String account);

}
