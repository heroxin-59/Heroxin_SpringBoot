package com.heroxin.hello.controller;

/*
    @Author Heroxin
    
    @Create 2023-03-07-11:21

    @Description:
*/

import com.heroxin.hello.po.User;
import com.heroxin.hello.service.UserService;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("userList")
    public  List<User> getAllUser(){
        return userService.getAllUser();
    }
    @RequestMapping("/deluser/{id}")
    public void deleteById(@PathVariable Integer id){
        userService.deleteById(id);
    }
}
