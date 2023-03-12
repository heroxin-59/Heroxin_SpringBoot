package com.heroxin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Heroxin
 * @create 2022-04-20-18:42
 * @Description:
 */
@RestController
@RequestMapping("/books")
@Slf4j // 日志注解
public class BookController {
//    创建记录日志的对象
//    private static final Logger log = LoggerFactory.getLogger(BookController.class);

    @GetMapping
    public String getById(){
        System.out.println("SpringBoot is running...");

        log.debug("debug...");
        log.info("info...");
        log.warn("warn...");
        log.error("errot...");

        return "SpringBoot is running...";
    }
}
