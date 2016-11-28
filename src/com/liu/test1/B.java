package com.liu.test1;

/**
 * Created by LiuSitong on 2016/11/24.
 */
public interface B {
    /*作业：接口interface重要特性： */

       void go();  // a。接口的方法都是抽象的。  b。接口的方法的作用域修饰符是public的 不写就是public 。
}

interface  B00 extends B000,B0000 {  // d.接口可以有多继承。
}
class  C{

}
class  B0   extends C implements  B ,B00{ //  c. 类和接口的关系是实现 implements,且可以多实现。解决了单根继承的冗余 不灵活问题。
   public void  go(){                     // e.类是先继承类，在实现接口
        System.out.println("nn");
    }

        }


interface   B000{
int a = 100;  //接口中的变量都是常量 继承时候不可以更改
}

interface   B0000{

}