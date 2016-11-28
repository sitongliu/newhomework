package com.liu.test0;

/**
 * Created by LiuSitong on 2016/11/20.
 */
public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        Car car0 = new Car("蓝色","H5");
        Car1 car1 = new Car1();
        Car1 car2 = new Car1("紫色","b1","布加迪威龙");

        car.ShowColor();
        car.ShowTypeNum();
        car0.ShowColor();
        car0.ShowTypeNum();
        car1.ShowTypeNum();
        car1.ShowColor();
    }
}
