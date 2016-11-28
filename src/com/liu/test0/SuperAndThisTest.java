package com.liu.test0;

/**
 * Created by LiuSitong on 2016/11/20.
 */
public class SuperAndThisTest  extends Father{
    SuperAndThisTest(){
        System.out.println("我是儿子-------");
    }


    public static void main(String[] args) {
        SuperAndThisTest satt= new SuperAndThisTest();
        Father father =new Father();
        GrandFather grandFather = new GrandFather();
        satt.hello();

    }
}
class  Father extends GrandFather{
    private  int k;
    Father(){
        this(100);
        System.out.println("我是Father无参构造器");
    }
    Father(int k){
        super(100);
        System.out.println("我是Father有参构造器");
    }
}
class  GrandFather{
    private  int n;
    {
        int n = 100;
    }
    GrandFather(){
        System.out.println("我是GrandFather无参构造器");
    }
    GrandFather(int n){
        System.out.println("我是GrandFather有参构造器");
    }

    void hello(){
        System.out.println("我说GrandFather的hello()");
    }

}
