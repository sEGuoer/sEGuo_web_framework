package D20230919.sevice.impl;

import D20230919.sevice.UserSevice;
import Demo.dao.UserDao;
import Demo.pojo.User;

public class UserSeviceNope implements UserSevice {

    protected UserDao userNope;



    public void setUserNope(UserDao userNope) {
        this.userNope = userNope;
    }

    public String userLogin(String email, String pwd){
          User user = userNope.getUserByEmail(email,pwd);
        return user.getPassword();}
}
