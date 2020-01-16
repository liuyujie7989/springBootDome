package com.liuyujie.demo.pojo;

/**
 * @program: springBootDome
 * @description:
 * @author: liuyishou
 * @create: 2019-04-11 10:18
 **/
public class User {

    private String userName;
    private Integer passWord;

    public User() {
    }

    public User(String userName, Integer passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getPassWord() {
        return passWord;
    }

    public void setPassWord(Integer passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", passWord=" + passWord +
                '}';
    }
}
