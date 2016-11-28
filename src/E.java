import sun.tools.jar.resources.jar;

/**
 * Created by LiuSitong on 2016/10/31.
 */
public class E {
    public static void main(String[] args) {
        for (int i=1;i<6;i++){
            for (int j=1;j<i;j++){
                System.out.print((char)(96+j));
            }
            for (int j=i-2;j>0;j--){
                System.out.print((char)(96+j));
            }
            System.out.println("");
        }


    }
}
