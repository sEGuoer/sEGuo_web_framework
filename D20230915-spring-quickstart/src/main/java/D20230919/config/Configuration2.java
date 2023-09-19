package D20230919.config;


import D20230919.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class Configuration2 {
    @Bean
    public User testConfiguration(){
        return new User("123","123");
    }
}
