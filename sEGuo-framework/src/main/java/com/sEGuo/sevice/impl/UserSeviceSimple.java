package com.sEGuo.sevice.impl;

import com.sEGuo.sevice.UserSevice;
import com.sEGuo.dao.UserDao;
import com.sEGuo.pojo.User;
import org.springframework.beans.factory.InitializingBean;


public class UserSeviceSimple implements UserSevice, InitializingBean{
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("UserSeviceSimple.afterPropertiesSet");
    }

    protected UserDao userSimple;

    public UserSeviceSimple(UserDao userSimple) {
        this.userSimple = userSimple;
    }


    public void destroy() {
        System.out.println("UserSeviceSimple.destroy");
    }


    public String userLogin(String email, String pwd) {
        User user = userSimple.getUserByEmail(email, pwd);
        return "email=" + user.getEmail() + " password=" + user.getPassword();
    }


}
