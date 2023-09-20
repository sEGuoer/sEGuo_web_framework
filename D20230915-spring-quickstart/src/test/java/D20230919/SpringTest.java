package D20230919;



import D20230919.SpringConfig.ScanConfig;
import D20230919.config.Configuration2;
import D20230919.pojo.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(Configuration2.class)
public class SpringTest {
    @Autowired
    ApplicationContext applicationContext;
    @Test
    void proxyBeanMethodsFalse(){
        User userDao1 = (User) applicationContext.getBean("testConfiguration");
        User userDao2 = (User) applicationContext.getBean("testConfiguration");
        Assertions.assertSame(userDao2,userDao1);
    }

    @Test
    void scanConfig(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScanConfig.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
        Assertions.assertNotNull(context.getBean("scanConfig"));
        Assertions.assertNotNull(context.getBean("scanDao"));
    }
}
