/**
 * Created by LiuSitong on 2016/10/27.
 */
public class x {
    public static void main(String[] args) {
        double a= 5.2;
        double b= 7.2;
     /*   System.out.println(7/0); //报错  ArithmeticException: / by zero
        System.out.println(7.0/0); //报错  ArithmeticException: / by zero
        System.out.println(7./0.0);
        System.out.println(7.0/0.0);*/
        // 由于0不能是分母所以报错

        System.out.println(7/2);
        System.out.println(7/2.1);  // 3.333333333333333
        System.out.println(7.0/2); // 3.5
        System.out.println(7.0/2.1); //3.333333333333333
        //只要有浮点数 得数就是浮点数

        //2.求模运算
       // System.out.println(7%0); //报错  ArithmeticException: / by zero
        System.out.println(7.0%0); //NaN
        System.out.println(7.%0.0); //NaN
        System.out.println(7.0%0.0);//NaN
        // 由于0不能是分母所以报错

        System.out.println(7%2); //1
        System.out.println(7%2.1);  // 0.6999999999999997
        System.out.println(7.0%2); // 1.0
        System.out.println(7.0%2.1); //0.6999999999999997

        System.out.println(-7%2.1);  // -0.6999999999999997
        System.out.println(7.0%-2); // 1.0
        System.out.println(-7.0%-2.1); //-0.6999999999999997







    }
}
