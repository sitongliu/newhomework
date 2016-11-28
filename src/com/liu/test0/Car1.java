package com.liu.test0;

/**
 * Created by LiuSitong on 2016/11/20.
 */
public class Car1 extends Car {
    private String provider;

    public  Car1(){
        this("black");
    }
    public Car1(String color) {
        this.setColor(color);
        this.provider ="宝马";

    }
    public  Car1(String color,String typenum, String provider){
        super(color,typenum);
        this.provider = provider;
    }

}
