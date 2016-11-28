/**
 * Created by LiuSitong on 2016/10/31.
 */
public class F {
    public static void main(String[] args) {
        int day = 0; //开始是0天
        double sum=0; //开始有0元
        while(true){
            day+=1;
            sum+=2.5;
            if (day%5==0){
               sum -=6;
            }
          if (sum>=100){
              break;
          }

        }System.out.println(day);


    }
}
