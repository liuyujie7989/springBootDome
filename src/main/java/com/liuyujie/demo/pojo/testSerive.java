package com.liuyujie.demo.pojo;

/**
 * @program: springBootDome
 * @description:
 * @author: liuyishou
 * @create: 2019-09-19 17:09
 **/
public class testSerive {
    public static void main(String[] args) {
        User user = new User();
        user.setUserName("register:all");
        if (user.getUserName()==XAConstants.all) {
            System.out.println("111");
        }


    }
}
