package com.sEGuo.dao;


import com.sEGuo.pojo.User;

public interface UserDao {
    public User getUserByEmail(String email, String pwd);
}
