package com.sEGuo.config;


import com.sEGuo.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration(proxyBeanMethods = false, value = "Configuration2")
public class Configuration2 {
    @Bean(name = "Configuration2Test")
    public User testConfiguration(){
        return new User("123","123");
    }
}
