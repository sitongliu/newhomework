/**
 * Created by LiuSitong on 2016/11/17.
 */
public class Person {
    private Face face;
    private Computer computer;

    Person(){
        face = new Face(); //这个和Person 是组合
    }
    public  void setC(Computer computer){  //与Person是聚合
        this.computer = computer;
    }

    public static void main(String[] args) {
        Computer c= new Computer();
        Person  p = new Person();
        p.setC(c);
     }

}

class Face{

}
class  Computer{

}