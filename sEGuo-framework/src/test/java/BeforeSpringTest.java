import com.sEGuo.dao.UserDao;
import com.sEGuo.pojo.User;
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
}
