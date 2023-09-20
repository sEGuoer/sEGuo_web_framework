package D20230919;



import D20230919.config.Configuration2;
import D20230919.pojo.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(Configuration2.class)
@ComponentScan("")
public class SpringTest {
    @Autowired
    ApplicationContext applicationContext;
    @Test
    void proxyBeanMethodsFalse(){
        User userDao1 = (User) applicationContext.getBean("testConfiguration");
        User userDao2 = (User) applicationContext.getBean("testConfiguration");
        Assertions.assertSame(userDao2,userDao1);
    }
}
