import com.sEGuo.dao.UserDao;
import com.sEGuo.pojo.User;
import com.sEGuo.sevice.UserSevice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeforeSpringTest {
    @Test
    void BeforeSpringTest(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        UserDao userDao1 = (UserDao)ac.getBean("UserDao");
        Assertions.assertNotNull(userDao1);
    }
    @Test
    void initAndDestroyMethodTest(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        UserSevice userSevice =(UserSevice) ac.getBean("UserSevice");
        Assertions.assertNotNull(userSevice);
        /*ac.close();
        * 此时就会显示出destroy的方法的输出结果
        * */

    }
    @Test
    void InitializingBeanTest(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        UserSevice userSevice =(UserSevice) ac.getBean("UserSevice");
        Assertions.assertNotNull(userSevice);
        /*ac.close();
        * 此时就会显示出destroy的方法的输出结果
        * */

    }
}
