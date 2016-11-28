/**
 * Created by LiuSitong on 2016/11/9.
 */
public class Student {
    boolean sex;
    int no;
    int old;
    String name;

    Student(){
        sex  = false;
         no = 0;
        old = 120;
        name = "大美女是我";

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



}
