package com.liu.test20161128;

/**
 * Created by LiuSitong on 2016/11/28.
 */
public class A {
    public static void main(String[] args) {
    /*    String a= "1111";
        String b= "1111";
        System.out.println(a==b);*/

        //由于IntegerCache 的原因 -128到127之内是缓存的
        Integer i = 100;
        Integer j = 100;
        System.out.println(i==j); //true
        Integer k=1000;
        Integer m=1000;
        System.out.println(k==m); //false
    }

}
