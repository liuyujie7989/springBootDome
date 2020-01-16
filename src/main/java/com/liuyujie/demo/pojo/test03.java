package com.liuyujie.demo.pojo;

/**
 * @program: springBootDome
 * @description:
 * @author: liuyishou
 * @create: 2019-08-05 15:23
 **/
public class test03 {
    public static void main(String[] args) {

        String decrypt = RSAUtils.decrypt("cjrzGatXYqKFYKlQdnH83vS4kZwSqpEBmFWwmBfHD1M8L3Y+t18Yw1NTBQgMqxRPgrRfSGwemxqdmgQa6u/b4ucOmmenZfbqQ0trr9DGLT9eiLsB1D8965mWbA5XfMV9Se4yfOj5m8xTjjkgJNRNKKfFBoW3BvPixhq5EmSYPm4=", RSAUtils.privateKey);
        System.out.println(decrypt);

    }
}
