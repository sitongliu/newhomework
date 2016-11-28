/**
 * Created by LiuSitong on 2016/11/12.
 */
public class Driver {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getE_Mail() {
        return E_Mail;
    }

    public void setE_Mail(String e_Mail) {
        E_Mail = e_Mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private int phoneNum;
    private String E_Mail;
    private  String address;
}

 class Track{
     private int speed;
     public int getSpeed() {
         return speed;
     }

     public void setSpeed(int speed) {
         this.speed = speed;
         if (speed>60){
             speed = 40;
             System.out.println("超速了呢");
         }
     }



}
