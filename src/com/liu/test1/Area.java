package com.liu.test1;
/**
 * Created by LiuSitong on 2016/11/22.
 */
public  abstract class Area {
    public abstract double getArea();
    public abstract double getLength();
}

class Circle extends Area{
    private double r;
    Circle(double r){
        this.r = r;
    }
    @Override
    public double getArea() {
        return Math.PI*r*r;
    }

    @Override
    public double getLength() {
        return 222;
    }
}
class EquilateralTriangle extends Area{
    @Override
    public double getArea() {
        return 333;
    }

    @Override
    public double getLength() {
        return 444;
    }
}
class  Rectangle extends Area{

    @Override
    public double getArea() {
        return 555;
    }

    @Override
    public double getLength() {
        return 666;
    }
}
