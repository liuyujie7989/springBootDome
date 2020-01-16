package com.liuyujie.demo.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @program: springBootDome
 * @description:
 * @author: liuyishou
 * @create: 2019-09-23 10:41
 **/
public class DateTest {
    public static void main(String[] args) {
        int currentMonh = getCurrentMonh();
        for (int i = 1; i <= currentMonh; i++) {
            String firstDayOfMonth="";
            String lastDayOfMonth="";
            if (i == currentMonh) {
                firstDayOfMonth = getFirstDayOfMonth(i);
                //System.out.println(firstDayOfMonth);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                 lastDayOfMonth = simpleDateFormat.format(new Date());
               // System.out.println(lastDayOfMonth);
            }else {
                 firstDayOfMonth = getFirstDayOfMonth(i);
               // System.out.println(firstDayOfMonth);
                lastDayOfMonth = getLastDayOfMonth(i);
                //System.out.println(lastDayOfMonth);
            }

        }
        System.out.println(getCurruntYearFirst());
    }
    public static String getCurruntYearFirst() {
        Calendar currCal = Calendar.getInstance();
        int currentYear = currCal.get(Calendar.YEAR);
        return getYearFirst(currentYear);
    }
    public static String getYearFirst(int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        Date currYearFirst = calendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String firstDayOfMonth = sdf.format(currYearFirst.getTime());
        return firstDayOfMonth;
    }
    public static int getCurrentMonh() {
        Calendar calendar=Calendar.getInstance();
        //获得当前时间的月份，月份从0开始所以结果要加1
        int yue=calendar.get(Calendar.MONTH)+1;
        return yue;

    }
    public static String getFirstDayOfMonth(int month) {
        Calendar cal = Calendar.getInstance();
        // 设置月份
        cal.set(Calendar.MONTH, month - 1);
        // 获取某月最小天数
        int firstDay = cal.getActualMinimum(Calendar.DAY_OF_MONTH);
        // 设置日历中月份的最小天数
        cal.set(Calendar.DAY_OF_MONTH, firstDay);
        // 格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String firstDayOfMonth = sdf.format(cal.getTime());
        return firstDayOfMonth;
    }
    /**
     * 获得该月最后一天
     *
     * @param
     * @param month
     * @return
     */
    public static String getLastDayOfMonth(int month) {
        Calendar cal = Calendar.getInstance();
        // 设置月份
        cal.set(Calendar.MONTH, month - 1);
        // 获取某月最大天数
        int lastDay=0;
        //2月的平年瑞年天数
        if(month==2) {
            lastDay = cal.getLeastMaximum(Calendar.DAY_OF_MONTH);
        }else {
            lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        }
        // 设置日历中月份的最大天数
        cal.set(Calendar.DAY_OF_MONTH, lastDay);
        // 格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String lastDayOfMonth = sdf.format(cal.getTime());

        return lastDayOfMonth;
    }
}
