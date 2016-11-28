package com.liu.test1;

/**
 * Created by LiuSitong on 2016/11/22.
 */
public class CountryEat {
    
    void  my(CountryEat ce){
        System.out.println("人们都喝水");
    }

    public static void main(String[] args) {
        CountryEat ce = new ChinaFood();

    }

}

class  ChinaFood extends CountryEat{
    public  void eat(){
        System.out.println("中国人吃饺子");
    }

}
class  AmericaFood extends CountryEat{
    public void eat(){
        System.out.println("美国吃牛排");
    }
}
class  JapanFoood extends  CountryEat{
    public  void  eat(){
        System.out.println("日本吃寿司");
    }
}
