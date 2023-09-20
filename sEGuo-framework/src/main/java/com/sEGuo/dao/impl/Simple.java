package com.sEGuo.dao.impl;

import com.sEGuo.dao.UserDao;
import com.sEGuo.pojo.User;
public class Simple implements UserDao {
    public User getUserByEmail(String email,String pwd) {
        User user = new User("123","123");
        user.setEmail(email);
        user.setPassword(pwd);
        return user;
    }
}
