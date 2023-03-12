package com.heroxin;

import com.heroxin.dao.UserDao;
import com.heroxin.daomain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBootDruidApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void contextLoads() {
        List<User> userList = userDao.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
    }

}
