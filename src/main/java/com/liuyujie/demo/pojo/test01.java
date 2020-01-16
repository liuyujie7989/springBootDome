package com.liuyujie.demo.pojo;

import com.liuyujie.demo.util.SaltUtils;
import com.ohaotian.plugin.common.util.DigestUtils;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @program: springBootDome
 * @description:
 * @author: liuyishou
 * @create: 2019-06-11 19:04
 **/
public class test01 {
    public static void main(String[] args) {
        ChangePwdReqBO changePwdReqBO =new ChangePwdReqBO();
        changePwdReqBO.setNewPassword("1qaz2wsx");
        String encrypt = DigestUtils.Encrypt(changePwdReqBO.getNewPassword(), "");
        String serialNo = SaltUtils.getSerialNo(8);
        String ggaPq7Tq = DigestUtils.Encrypt(encrypt+"DTqgDzTI", "");

        //实例化当天的日期
        Date today = new Date();
        //用当天的日期减去昨天的日期
        Date yesterdayDate = new Date(today.getTime()-86400000L);
        String yesterday = new SimpleDateFormat("yyyy-MM-dd").format(yesterdayDate);


        System.out.println(yesterday);

    }
}
