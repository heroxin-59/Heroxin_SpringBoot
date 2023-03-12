package com.heroxin.hello.service;

/*
    @Author Heroxin
    
    @Create 2023-03-07-11:20

    @Description:
*/

import com.heroxin.hello.po.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    void deleteById(Integer id);
}
