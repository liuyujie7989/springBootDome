package com.liuyujie.demo;

import com.liuyujie.demo.config.MyConfig;
import com.liuyujie.demo.pojo.Person;
import com.liuyujie.demo.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private Person person;
    @Test
    public void contextLoads() {


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        User bean = context.getBean(User.class);
        System.out.println(bean);
    }


        @Test
    public void person() {

        System.out.println(person);

    }

}
