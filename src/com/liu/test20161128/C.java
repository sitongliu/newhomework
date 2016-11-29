package com.liu.test20161128;

/**
 * Created by LiuSitong on 2016/11/29.
 */
public class C {
    public static void main(String[] args) {
        //去掉字符串里面的空格
        String a= "  hello   world ";
        System.out.println(a.trim().replaceAll("\\s+",""));
    }


}
