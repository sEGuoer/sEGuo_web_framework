import com.sEGuo.config.Configuration1;
import com.sEGuo.pojo.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Configuration1Test {
    @Test
    void ConfigurationTestOne(){
        ApplicationContext ac=new AnnotationConfigApplicationContext(Configuration1.class);
        Configuration1 configuration1 =(Configuration1) ac.getBean("Configuration1");
        User user1 = configuration1.testConfiguration();
        User user2 = configuration1.testConfiguration();
        Assertions.assertSame(user2,user1);
    }
}
