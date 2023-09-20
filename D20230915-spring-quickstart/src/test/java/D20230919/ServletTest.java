package D20230919;

import Demo.dao.UserDao;
import Demo.sevice.UserSevice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServletTest {
    @Test
    void lifeCycle(){
        Assertions.assertNotNull("listener->构造器->init->service(可以多次)->destroy");
    }
    @Test
    void xmlInitAndDestroy(){
        ClassPathXmlApplicationContext cpa = new ClassPathXmlApplicationContext("bean.xml");
        UserSevice userSevice = (UserSevice)cpa.getBean("UserSevice");
        UserSevice userSevice1 = (UserSevice)cpa.getBean("UserSevice");
        cpa.close();
        Assertions.assertNotNull("通过bean.xml实现servlet服务器中的init和destroy方法");
    }
    @Test
    void ServletInitImpl(){
        ClassPathXmlApplicationContext cpa = new ClassPathXmlApplicationContext("bean.xml");
        cpa.close();
        Assertions.assertNotNull("InitializingBean(spring给的规范初始化接口)");
    }
}
