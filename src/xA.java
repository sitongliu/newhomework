/**
 * Created by LiuSitong on 2016/10/26.
 */
public class xA {

    public static void main(String[] args) {
        int a=2016;
        System.out.println(((a%4==0)&&(a%100!=0))||(a%400==0)); //判断闰年

        System.out.println(circle(1)); //圆形
        System.out.println(square(2)); // 正方形
        System.out.println(rectangle(4,5)); //长方形
        System.out.println(triangle(4,5)); // 三角形
    }

    public static double circle(double r){
        return 3.14*r*r;
    }

    public static double square(double r1 ){
        return r1*r1;
    }

    public static double rectangle(double r1,double r2 ){
        return r1*r2;
    }
    public static double triangle(double a,double h ){
        return 0.5*a*h;
    }




}
