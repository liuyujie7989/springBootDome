package com.liuyujie.demo.config;

import com.liuyujie.demo.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: springBootDome
 * @description:
 * @author: liuyishou
 * @create: 2019-04-11 10:21
 **/
@Configuration
public class MyConfig {

    @Bean
    public User getUser() {
        return  new User("李四",18);
    }
}
