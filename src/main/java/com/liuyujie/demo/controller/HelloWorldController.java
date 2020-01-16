package com.liuyujie.demo.controller;

import com.liuyujie.demo.pojo.User;
import org.springframework.web.bind.annotation.*;

/**
 * @program: springBootDome
 * @description:
 * @author: liuyishou
 * @create: 2019-04-02 11:22
 **/
@RestController
@RequestMapping("/helloWorldController")
public class HelloWorldController {
    @RequestMapping(value = "/SS/{name}",method = RequestMethod.GET)
    public String sayHello(@PathVariable  String name) {

        return "我是"+name;
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public Object getUser(  User user) {
        System.out.println(user);
        User user1 = new User();
    user1.setUserName("liuyishou");
    user1.setPassWord(3423423);

        return user1;
    }

}
