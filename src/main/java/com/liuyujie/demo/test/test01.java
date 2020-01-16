package com.liuyujie.demo.test;

import com.aliyun.openservices.shade.org.apache.commons.lang3.StringUtils;
import com.liuyujie.demo.pojo.User;

import java.net.UnknownServiceException;

/**
 * @program: springBootDome
 * @description:
 * @author: liuyishou
 * @create: 2019-09-19 19:13
 **/

public class test01 {
    public static void main(String[] args) {
        String a = new String("ab"); // a 为一个引用
        String b = new String("ab"); // b为另一个引用,对象的内容一样
        String aa = ""; // 放在常量池中
        String bb = "ab"; // 从常量池中查找
        if (aa == bb) // true
            System.out.println("aa==bb");
        if (a == b) // false，非同一对象
            System.out.println("a==b");
        if (a.equals(b)) // true
            System.out.println("aEQb");
        if (aa.equals(bb)) // true
            System.out.println("99");
        if (42 == 42.0) { // true
            System.out.println("true");
        }
        if (aa!=null && "".equals(aa)) {
            System.out.println("zhxinglll");
        }
        System.out.println(StringUtils.isBlank(""));
        System.out.println(StringUtils.isBlank(null));
        System.out.println(StringUtils.isBlank(" "));

        System.out.println(StringUtils.isEmpty(""));
        System.out.println(StringUtils.isEmpty(null));
        System.out.println(StringUtils.isEmpty(" "));

    }
}



