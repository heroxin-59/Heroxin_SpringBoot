package com.heroxin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProfileApplication {
//    查看启动的端口，看多环境作用
    public static void main(String[] args) {
        SpringApplication.run(SpringBootProfileApplication.class, args);
    }

}
