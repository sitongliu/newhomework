/**
 * Created by LiuSitong on 2016/10/30.
 */
public class A {
    public static void main(String[] args) {
     /*//age=45 判断是哪个年龄 两种写法。
        //方法一  用区间表示
        int age = 45;
        if (age>=10&&age<30){
            System.out.println("我是青年");
        }else if (age>=30&&age<50){
            System.out.println("我是中年");
        }else if (age>=50) {
            System.out.println("我是老年");
        }else{
            System.out.println("无法判断");
        }
        //方法二
        int age2=30;
        if (age2>60){
            System.out.println("我是老年");
        }else if (age2>40){
            System.out.println("我是中年");
        }else if (age2>20){
            System.out.println("我是青年");
        }
        */

        int year = 4561;

        if (((year%4==0)&&(year%100!=0))||(year%400==0)){
            System.out.println("是闰年");
        }else {
            System.out.println("不是闰年");
        }


    }

}
