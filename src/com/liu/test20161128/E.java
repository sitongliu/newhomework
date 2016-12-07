package com.liu.test20161128;

/**
 * Created by LiuSitong on 2016/11/29.
 */
public class E {
    public static void main(String[] args) {
        People people = new People(100,"xiaoming");
        People people1 = new People(100,"xiaoming");
        System.out.println(people.equals(people1));
    }
}
class People{
    private  int age;
    private  String name;

    public People(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {//obj被比对象 this：比较对象
        if(this==obj){//咱两堆一样，
            return true;
        }
        if(obj==null){//Obj为空，能比吗？
            return false;
        }
        if(this.getClass()!=obj.getClass()){//不是同一个种族
            return false;
        }
        People a=(People)obj;


        return this.age-a.age==0 && this.name.compareTo(a.name)==0;
    }
}

class  Lily{
    private  int age;
    private  String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}