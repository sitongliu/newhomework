package com.liu.test20161128;

/**
 * Created by LiuSitong on 2016/11/29.
 */
public class D {
    public static void main(String[] args) {
        String str = "你好，我是%机器人";
        String[] a = str.split("%");
        for (String k : a) {
            System.out.println(k);
        }
        String str1 = "hello";
        String str2 =new String( "Hello");
        System.out.println(str1 == str2);  //false
        System.out.println(str1.equalsIgnoreCase(str2)); //true

        System.out.println(str1.startsWith("j"));
        System.out.println(str2.compareTo("hellllll"));

        int i=Integer.parseInt("9"); //字符串变成int； parse --分析
        System.out.println(i);
    }
}
