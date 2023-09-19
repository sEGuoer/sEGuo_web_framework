package D20230919.dao.impl;

import D20230919.dao.UserDao;
import Demo.pojo.User;

public class Simple implements UserDao {
    public User getUserByEmail(String email,String pwd) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(pwd);
        return user;
    }
}
