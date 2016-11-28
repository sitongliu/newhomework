package com.liu.test1;

/**
 * Created by LiuSitong on 2016/11/22.
 */
public class TestArea {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println(circle.getArea()+"//"+circle.getLength());

        EquilateralTriangle et= new EquilateralTriangle();
        System.out.println(et.getArea()+"//"+et.getLength());

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getArea()+"//"+rectangle.getLength());


    }
}
