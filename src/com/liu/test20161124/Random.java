package com.liu.test20161124;

/**
 * Created by LiuSitong on 2016/11/26.
 */
public class Random {
    public static void main(String[] args) {

        char [] a = new char[10];
        boolean flag= false ;
        for (int i = 0; i < 10; i++) {
            flag = true;
            while (flag){
                flag= false;
                a[i] = (char)(Math.random() * 26 + 97);
                for (int j= 0;j<i;j++){
                    if (a[i]==a[j]){
                        flag = true;
                        break;
                    }
                }

            }

        }
        for (char k :a){
            System.out.print(k);
        }
    }

    }




