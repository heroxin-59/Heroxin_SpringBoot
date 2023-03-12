package com.heroxin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Heroxin
 * @create 2022-04-10-16:04
 * @Description:
 */
@RestController
@RequestMapping("/boots")
public class HelloBoot {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello MyBoot";
    }
}
