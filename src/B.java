/**
 * Created by LiuSitong on 2016/10/30.
 */
public class B {
    public static void main(String[] args) {
        //判断分数的等级
        /*
        0=<score<20  1
        20=<score<40 2
        40=<score<60 3
        60=<score<80 4
        80=<score<100 5  100
         */
        int score = 58;
        if (score==100){
            System.out.println("5");
        }else {
        switch (score/20+1){
            case 1: {
                System.out.println("1");
                break;
            }
            case 2:{
                System.out.println("2");
                break;
            }
            case 3:{
                System.out.println("3");
                break;
            }
            case 4:{
                System.out.println("4");
                break;
            }
            case 5:{
                System.out.println("5");
                break;
            }
            default:{
                System.out.println("erro");
            }
        }
        }







      /*  String season="春季";
        switch (season){
            case "春季":{
                System.out.println("我是春季");
                break;
            }
            case "秋季":{
                System.out.println("我是秋季");
                break;
            }
            case "夏季":{
                System.out.println("我是夏季");
                break;
            }
            case "冬季":{
                System.out.println("我是冬季");
                break;
            }
            default:{
                System.out.println("错误！");
            }

        }*/
    }
}
