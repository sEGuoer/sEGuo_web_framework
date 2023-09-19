package com.d20230915springquickstart;

import Demo.dao.UserDao;
import Demo.dao.impl.Nope;
import Demo.dao.impl.Simple;
import Demo.sevice.UserSevice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
class D20230915SpringQuickstartApplicationTests {

    @Test
    void ioc() {
        ClassPathXmlApplicationContext cpa = new ClassPathXmlApplicationContext("bean.xml");
        Assertions.assertTrue(cpa.containsBean("UserSevice"));
        UserSevice userSevice = (UserSevice)cpa.getBean("UserSevice");
        System.out.println(userSevice.userLogin("1","1"));
        Assertions.assertEquals("email=1 password=1",userSevice.userLogin("1","1"));
    }
    @Test
    void di() {
        ClassPathXmlApplicationContext cpa = new ClassPathXmlApplicationContext("bean.xml");
        Assertions.assertTrue(cpa.containsBean("UserSevice"));
        UserSevice userSevice = (UserSevice)cpa.getBean("UserSevice");
        UserDao userDao =  cpa.getBean(Simple.class);
        Assertions.assertInstanceOf(Simple.class,userDao);
        Assertions.assertEquals("User{email='123', password='123'}",userDao.getUserByEmail("123","123").toString());
    }

}
