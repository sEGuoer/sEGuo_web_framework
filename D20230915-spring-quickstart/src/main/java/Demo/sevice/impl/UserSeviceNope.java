package Demo.sevice.impl;

import Demo.dao.UserDao;
import Demo.pojo.User;
import Demo.sevice.UserSevice;

public class UserSeviceNope implements UserSevice {

    protected UserDao userNope;



    public void setUserNope(UserDao userNope) {
        this.userNope = userNope;
    }

    public String userLogin(String email, String pwd){
          User user = userNope.getUserByEmail(email,pwd);
        return user.getPassword();}
}
