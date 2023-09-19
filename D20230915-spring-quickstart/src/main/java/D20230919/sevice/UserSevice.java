package D20230919.sevice;

public interface UserSevice {

    public default String userLogin(String email,String pwd){return "";}
}
