package com.sEGuo.config;


import com.sEGuo.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = true , value = "Configuration1")
public class Configuration1 {
    @Bean(name = "ConfigurationTest1")
    public User testConfiguration(){
        return new User("123","123");
    }
}
