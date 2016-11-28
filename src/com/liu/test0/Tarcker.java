package com.liu.test0;

/**
 * Created by LiuSitong on 2016/11/20.
 */
public class Tarcker {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed>60){
            this.speed = speed;
        }
        System.out.println("超速了");
    }
}
