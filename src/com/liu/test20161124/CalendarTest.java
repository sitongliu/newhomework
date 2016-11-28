package com.liu.test20161124;

import sun.util.calendar.BaseCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by LiuSitong on 2016/11/24.
 */
public class CalendarTest {
    public static void main(String[] args) {
        //输出今日的日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        System.out.println("今天是" + sdf.format(date));

        //输出星期
        String[] aa = {"一", "二", "三", "四", "五", "六", "日"};
        for (String s : aa) {
            System.out.print(s + " ");
        }
        System.out.println("");

        //获取本月开始日期的
        //1.获取今天的日期
        Calendar c = Calendar.getInstance();
        int today = c.get(Calendar.DAY_OF_MONTH); //今天的日期
        int weekday = c.get(Calendar.DAY_OF_WEEK) - 1; //今天是周几
        /*System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK)-1); */
        int a = today % 7; //a用来推断1号周几;
        /*       System.out.println("---"+a);*/
        int b = weekday - a;  //本月的开始是周几 从0开始；//这个等于1
        int i;
      /*System.out.println("---"+b);*/
        int[] bb = new int[30 + b];

        //输出日期
        for (i = 1; i < 31 + b; i++) {
            if (i < b + 1) {
                bb[i] = 0;
                System.out.print("   ");
            }
            if (b + 1 <= i) {
                bb[i - b] = i - b;
                if (bb[i - b] == today) {
                    System.out.print(bb[i - b] + "*");
                } else {
                    System.out.print(bb[i - b]);
                    System.out.print(" ");
                }
                if (bb[i - b] < 10) {
                    System.out.print(" ");
                }
                if (i % 7 == 0) {
                    System.out.println("");
                }


            }

        }
    }
}
