package com.heroxin.dao.impl;

import com.heroxin.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author Heroxin
 * @create 2022-04-11-16:21
 * @Description:
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void show() {
        System.out.println("UserDaoImpl.show");
    }
}
