/**
 * Created by LiuSitong on 2016/11/16.
 */

//封装就是private 就是私有的 自己私有的自己类能用 但是在别的类中就不能用了只能调用方法

public class EncapsulationTest {
    public static void main(String[] args) {

        Driver driver = new Driver();  //在EncapsulationTest这个类中要是想用Driver对象的属性 只能通过方法的调用
        driver.getAddress();

        //强内聚 ：类的功能尽量在类的内部完成 少的让外界更改干预
        //低耦合 ：提供给外部尽量少的方法调用

    }
}
