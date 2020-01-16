package com.liuyujie.demo.pojo;

/**
 * @program: springBootDome
 * @description:
 * @author: liuyishou
 * @create: 2019-04-11 10:18
 **/
public class User2 {

    private String userName;


    public User2() {
    }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User2{" +
                "userName='" + userName + '\'' +
                '}';
    }
}
