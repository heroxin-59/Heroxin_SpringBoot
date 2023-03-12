package com.heroxin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Heroxin
 * @create 2022-05-20-12:26
 * @Description:
 */
@Controller
public class HelloController {
    /**
     * 跳转到 hello.html
     * @return 自动配置好视图解析器,直接写文件名就可以
     */
    @GetMapping("/hello")
    public String toHello(){
        return "hello";
    }
//    @GetMapping("/login")
//    public String tolog(){
//        return "login";
//    }

}
