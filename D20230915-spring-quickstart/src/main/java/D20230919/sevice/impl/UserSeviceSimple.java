package D20230919.sevice.impl;

import D20230919.sevice.UserSevice;
import Demo.dao.UserDao;
import Demo.pojo.User;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UserSeviceSimple implements UserSevice, InitializingBean, DisposableBean {
    protected UserDao userSimple;

    public UserSeviceSimple(UserDao userSimple) {
        this.userSimple = userSimple;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("UserSeviceSimple.afterPropertiesSet");
    }


    public String userLogin(String email, String pwd){
        User user = userSimple.getUserByEmail(email,pwd);
        return "email="+user.getEmail()+" password="+user.getPassword();
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("UserSeviceSimple.destroy");
    }
}
