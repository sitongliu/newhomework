package com.liu.test20161204;
/**
 * Created by LiuSitong on 2016/12/4.
 * 潜克隆 Fleet Clone
 * 深克隆 Deep Clone
 */
public class B {

    public static void main(String[] args) {
        Sheep sheep = new Sheep("Dolly",1,new Person("lily"));
        Sheep sheep1 = null;

        try {
            sheep1 =(Sheep)sheep.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //Deep Clone
        System.out.println(sheep1.getAge()+"  "+sheep1.getName() + " "+sheep1.getPerson().getPersonname());

    }
}

//Deep Clone
class  Person implements Cloneable{
    private  String personname;

    public Person(String personname) {
        this.personname = personname;
    }

    public String getPersonname() {
        return personname;
    }

    public void setPersonname(String personname) {
        this.personname = personname;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


class  Sheep implements  Cloneable{
  private   String name;
   private int age;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    private  Person person;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Sheep(String name , int age ,Person person){
        this.name = name;
        this.age = age;
        this.person = person;

    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
       Sheep s =(Sheep)super.clone();
       s.person = (Person)this.person.clone();
        return  s;
    }

}