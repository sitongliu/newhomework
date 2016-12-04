package com.liu.test20161204;
import java.util.Arrays;

/**
 * Created by LiuSitong on 2016/12/4.
 * 对象数组的排序和查找
 */
public class A {
    public static void main(String[] args) {
        People people = new People(10,"Shenyang");
        People people1 = new People(20,"Harbin");

        People []a={people,people1};  //People 类型的对象数组
        Arrays.sort(a);
        System.out.println(Arrays.binarySearch(a,people));  //二分查找对象数组 类比普通数组
        for (People k :a){
            System.out.println(k.old+"   "+k.address);
        }

    }
}
class People  implements  Comparable{  //想要对对象数组进行排序 就需要 implements Comparable接口
    int old;
    String address;

    People(int old,String address){
        this.old=old;
        this.address = address;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public int compareTo(Object o) {  //重写CompareTo的方法
        People o1 = (People)o;
        return this.old-o1.old;  //返回结果分为大于0 等于0 小于0
    }
}
