

import com.sEGuo.config.Configuration2;
import com.sEGuo.config.ScanConfig;
import com.sEGuo.config.ScanConfig2;
import com.sEGuo.pojo.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(Configuration2.class)
public class Configuration2Test {
    @Autowired
    ApplicationContext applicationContext;
    @Test
    void proxyBeanMethodsFalse(){
        Configuration2 configuration2 =(Configuration2) applicationContext.getBean("Configuration2");
        User user1 = configuration2.testConfiguration();
        User user2 = configuration2.testConfiguration();
//        Assertions.assertSame(user2,user1);
//        因为不是返回同一个user，所以会报错

    }

    @Test
    void scanConfig(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScanConfig.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
        Assertions.assertTrue(context.containsBean("scanConfig"));
        Assertions.assertTrue(context.containsBean("scanDao"));
    }
    @Test
    void scanConfig2(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScanConfig2.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
        Assertions.assertFalse(context.containsBean("scanConfig"));
        Assertions.assertTrue(context.containsBean("scanDao"));
    }
}
