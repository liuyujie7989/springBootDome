package com.liuyujie.demo.test;

import com.ohaotian.plugin.common.util.DateUtils;

import java.util.Date;

/**
 * @program: springBootDome
 * @description:
 * @author: liuyishou
 * @create: 2019-10-08 11:56
 **/
public class workDayTest {
    public static void main(String[] args) {
        Date startdate = DateUtils.strToDate("2019-09-30");
        Date enddate = DateUtils.strToDate("2019-10-08");
        int weekends = WorkDayUtils.getWeekends(startdate, enddate);
        int dayofweek = WorkDayUtils.getDayofweek("2019-09-30");
        Long aLong = WorkDayUtils.workdayCount("2019-09-30", "2019-10-08");
        System.out.println(weekends);
        System.out.println(dayofweek);
        System.out.println(aLong);
    }
}
