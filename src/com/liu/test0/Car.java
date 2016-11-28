package com.liu.test0;

/**
 * Created by LiuSitong on 2016/11/20.
 */
public class Car {
    private  String color;
    private  String typenum;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTypenum() {
        return typenum;
    }

    public void setTypenum(String typenum) {
        this.typenum = typenum;
    }

    Car(){
        this.color = "红色";
        this.typenum = "Z1";
    }
    Car(String color ,String typenum){
        this.color = color;
        this.typenum = typenum;
    }
    public void ShowColor(){
        System.out.println("颜色"+this.color);
    }
    public void ShowTypeNum(){
        System.out.println("型号"+this.typenum);
    }

}
