package com.heroxin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 程序的主入口
@SpringBootApplication // 标注这个类是一个 springboot 的应用
public class SpringBootQuickStartApplication {

    public static void main(String[] args) {
//        将 springboot 启动
        SpringApplication.run(SpringBootQuickStartApplication.class, args);
    }

}
