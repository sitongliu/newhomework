package com.liu.test0;

/**
 * Created by LiuSitong on 2016/11/21.
 */
public class A {
    private Hand hand;
    private  Computer computer;
    A(){
       this.hand = new Hand();
    }

   public void  setComputer(){
       this.computer =  new Computer();
    }
}

class Hand{
}

class  Computer{

}