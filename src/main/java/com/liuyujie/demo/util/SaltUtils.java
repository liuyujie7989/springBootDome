package com.liuyujie.demo.util;

import java.util.Random;

/**
 * 生成随机salt
 *
 * @author luqi
 * @data 2018/7/18
 */
public class SaltUtils {

    public static char[] serialNo = {'1', '2', '3', '4', '5', '6', '7', '8',
            '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y',
            'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
            'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y',
            'Z'};


    /**
     * 生成随机salt
     *
     * @param size 生成salt的长度
     * @return 指定长度的随机数
     */
    public static String getSerialNo(int size) {
        Random random = new Random();
        char[] cs = new char[size];
        for (int i = 0; i < cs.length; i++) {
            cs[i] = serialNo[random.nextInt(serialNo.length)];
        }
        return new String(cs);
    }
}
