package com.heroxin.hello.controller;

/*
    @Author Heroxin
    
    @Create 2023-02-28-10:27

    @Description:
*/

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello heroxin wen";
    }
}
