/**
 * Created by LiuSitong on 2016/11/8.
 */
public class K {
    //sex no old name,address money{ Student,People } getter/setter
    //不仅赋值，还有取值，说出来一句话
    public static void main(String[] args) {
        K s = new K();
        s.getName();



    }

    boolean sex;
    int no;
    int old;
    String name;
    String address;
    double money;

    boolean isSex() {
        return sex;
    }

     void setSex(boolean sex) {
        this.sex = sex;
    }

     int getNo() {
        return no;
    }

     void setNo(int no) {
        this.no = no;
    }

     int getOld() {
        return old;
    }

     void setOld(int old) {
        this.old = old;
    }

     String getName() {
        return name;
    }

     void setName(String name) {
        this.name = name;
    }

     String getAddress() {
        return address;
    }

     void setAddress(String address) {
        this.address = address;
    }

     double getMoney() {
        return money;
    }

     void setMoney(float money) {
        this.money = money;
    }

     K() {
        boolean sex=true;
        int no  = 20;
        int old = 21;
        String name ="liusitong";
        String address="liaoning";
        double money = 250;
    }


}