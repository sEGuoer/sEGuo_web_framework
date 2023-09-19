package Demo.dao;


import Demo.pojo.User;

public interface UserDao {
    public User getUserByEmail(String email, String pwd);
}
