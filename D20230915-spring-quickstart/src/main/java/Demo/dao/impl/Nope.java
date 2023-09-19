package Demo.dao.impl;

import Demo.dao.UserDao;
import Demo.pojo.User;


public class Nope implements UserDao {
    @Override
    public User getUserByEmail(String email,String pwd) {
        User user = new User();
        user.setEmail(email);
        user.setPassword("");
        return user;
    }
}
