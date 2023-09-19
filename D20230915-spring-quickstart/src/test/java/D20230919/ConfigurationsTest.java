package D20230919;

import D20230919.config.Configuration1;
import D20230919.dao.UserDao;
import D20230919.pojo.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ConfigurationsTest {
    @Test
    void proxyBeanMethodsTrue(){
        ApplicationContext ac=new AnnotationConfigApplicationContext(Configuration1.class);
        User userDao1 = (User) ac.getBean("testConfiguration");
        User userDao2 = (User) ac.getBean("testConfiguration");
        Assertions.assertSame(userDao2,userDao1);
    }
}
