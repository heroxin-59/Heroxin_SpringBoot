package com.heroxin.dao;

import com.heroxin.daomain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Heroxin
 * @create 2022-04-11-18:30
 * @Description:
 */
@Mapper
public interface UserDao {
    @Select("select * from user")
    List<User> getUserList();
}
