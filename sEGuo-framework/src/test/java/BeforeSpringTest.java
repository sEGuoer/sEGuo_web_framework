import com.sEGuo.dao.UserDao;
import com.sEGuo.pojo.User;
import com.sEGuo.sevice.UserSevice;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeforeSpringTest {
    static String a;


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
    @BeforeAll
    static void BeforeAllTest(){
        System.out.println("BeforeSpringTest.BeforeAllTest");
        a = "1";
    }
    @AfterAll
    static void AfterAllTest(){
        System.out.println("BeforeSpringTest.AfterAllTest");
        a = "3";
    }
    @Test
    void InitializingBeanTest(){
        System.out.println(a);
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        UserSevice userSevice =(UserSevice) ac.getBean("UserSevice");
        Assertions.assertNotNull(userSevice);
        /*ac.close();
        * 此时就会显示出destroy的方法的输出结果
        * */

    }
    @Test
    void DisposableBeanTest(){
        System.out.println(a);
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        UserSevice userSevice =(UserSevice) ac.getBean("UserSevice");
        Assertions.assertNotNull(userSevice);
        /*ac.close();
        * 此时就会显示出destroy的方法的输出结果(接口重写的方法)
        * */

    }
}
