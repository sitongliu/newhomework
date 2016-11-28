/**
 * Created by LiuSitong on 2016/11/8.
 */
public class People {
    boolean sex;
    int no;
    int old;
    String name;
    String address;
    double money;

    People(){
         sex =false;
         no = 25;
         old =256;
         name ="lalalal";
         address = "黑龙江";
         money= 25.45;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }



}
