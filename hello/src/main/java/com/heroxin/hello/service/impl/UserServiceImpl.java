package com.heroxin.hello.service.impl;

/*
    @Author Heroxin
    
    @Create 2023-03-07-11:20

    @Description:
*/

import com.heroxin.hello.mapper.UserMapper;
import com.heroxin.hello.po.User;
import com.heroxin.hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    @Cacheable(value = "UserCache",key = "'user.getAllUser'")
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    @Cacheable(value = "UserCache",key = "'user.getAllUser'")
    public void deleteById(Integer id) {
        userMapper.deleteById(id);
    }
}
