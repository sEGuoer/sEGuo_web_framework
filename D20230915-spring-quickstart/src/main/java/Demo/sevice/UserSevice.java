package Demo.sevice;

public interface UserSevice {

    public default String userLogin(String email,String pwd){return "";}
}
