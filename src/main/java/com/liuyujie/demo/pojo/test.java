package com.liuyujie.demo.pojo;

import com.ohaotian.plugin.db.Sequence;

/**
 * @program: springBootDome
 * @description:
 * @author: liuyishou
 * @create: 2019-05-22 18:05
 **/
public class test {

    public static void main(String[] args) throws Exception {
            for (int i = 0; i < 69; i++) {
            Sequence sequence = Sequence.getInstance();
            long l = sequence.nextId();
                System.out.println(l);
        }

    }
    public static void test() throws Exception {



        System.out.println(System.currentTimeMillis());


    }



}

