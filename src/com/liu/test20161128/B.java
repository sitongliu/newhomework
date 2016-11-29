package com.liu.test20161128;

/**
 * Created by LiuSitong on 2016/11/29.
 */
public class B {
    //StringBuffer StringBuilder
    //区别 StringBuffer

    /**
     * StringBuffer：线程同步，安全，但是速度慢。
     * StringBuilder：线程异步，不安全，速度快。
     */

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.capacity()); //  初始容量  为16个字符。
        sb1.append("MynameisLiusitong"); //追加字符串
        System.out.println(sb1.capacity());  //再次开容量就是34 （16+1）*2
        sb1.length(); //字符串的长度
        sb1.reverse();//字符串的翻转
        sb1.appendCodePoint(97);
        System.out.println(sb1);  //追加Unicode码为97的  codePoint --Unicode 代码点
        sb1.delete(5,14); //删除从5到14
        System.out.println(sb1);
       sb1.indexOf("ll",4);
        System.out.println(sb1.indexOf("i",4)); //从指定的索引处开始，返回第一次出现的指定子字符串在该字符串中的索引
        sb1.insert(4," add "); //指定位置插入字符串
        System.out.println(sb1);
        System.out.println(sb1.substring(1,2));  //截取1到2位置的字符串

        StringBuffer sb = new StringBuffer();
        sb.append("Hello World").append("  Hello World");
        sb.length();
        System.out.println(sb.length());
    }


}
