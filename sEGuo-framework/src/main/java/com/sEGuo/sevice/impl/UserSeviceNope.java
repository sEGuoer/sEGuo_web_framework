package com.sEGuo.sevice.impl;

import com.sEGuo.sevice.UserSevice;
import com.sEGuo.dao.UserDao;
import com.sEGuo.pojo.User;

public class UserSeviceNope implements UserSevice {

    protected UserDao userNope;



    public void setUserNope(UserDao userNope) {
        this.userNope = userNope;
    }

    public String userLogin(String email, String pwd){
          User user = userNope.getUserByEmail(email,pwd);
        return user.getPassword();}
}
