package com.heroxin;

import com.heroxin.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootJunitApplicationTests {
// 注入你要测试的类
    @Autowired
    private UserDao userDao;
    @Test
    void contextLoads() {
//        掉用测试的方法
        userDao.show();
    }

}
