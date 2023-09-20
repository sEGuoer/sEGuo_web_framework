package Demo.sevice.impl;

import Demo.dao.UserDao;
import Demo.pojo.User;
import Demo.sevice.UserSevice;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UserSeviceSimple implements UserSevice, InitializingBean {
    protected UserDao userSimple;

    public UserSeviceSimple(UserDao userSimple) {
        this.userSimple = userSimple;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("接口规定的初始化UserSeviceSimple.afterPropertiesSet");
    }


    public String userLogin(String email, String pwd){
        User user = userSimple.getUserByEmail(email,pwd);
        return "email="+user.getEmail()+" password="+user.getPassword();
    }


}
