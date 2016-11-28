/**
 * Created by LiuSitong on 2016/10/30.
 */
public class C {
public static void main(String[] args) {

    for (int i= 1;i<11;i++){
       for (int j=1;j<=i;j++){
            System.out.print(" ");
        }
        for (int j=10;j>=i;j--){
            System.out.print("*");
        }
        System.out.println("");
    }



  // 大宝剑
    for (int i =1;i<=11;i++){
        for (int j=1;j<=22-2*i;j++){
            System.out.print(" ");
        }
       for (int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println("");
    }


    /**
     * 空心环
     */

    int i ;
    int j ;

  for ( i = 0;i<4;i++){
       for ( j=1;j<=8-2*i;j++){
           System.out.print(2*(i+1));
        }
      for (j=9-2*i;j<=8+2*i;j++){
            System.out.print(" ");
        }
        for ( j=10+2*i;j<=17;j++){
            System.out.print(2*(i+1));
        }
        System.out.println("");
    }

    for (int m=0;m<4;m++){
        for(int n=0;n<2*m+2;n++){
            System.out.print(8-2*m);
        }
        for (int n=2*m+2;n<14-2*m;n++){
            System.out.print(" ");
        }
        for (int n=14-2*m;n<16;n++ ){
            System.out.print(8-2*m);
        }
        System.out.println("");

    }

}

}
