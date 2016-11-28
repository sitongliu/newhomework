import java.util.Arrays;

/**
 * Created by LiuSitong on 2016/11/1.
 */
public class G {

    public static void main(String[] args) {
        //maxNum();
        //avg();
       // arrayMethods();
       // binarySearch();
        Rever();
      /*  int a[] = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.binarySearch(a,6));*/



    }

    //数组颠倒
    static  void  Rever(){
        int a[] = {1, 2, 3, 4, 5, 6};

        for (int i=0;i<a.length/2;i++){
            int temp = a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i] = a[i];
        }
        System.out.println(a);

    }



    //折半查找
    /*static  void binarySearch(){
        int a[] = {1, 2, 3, 4, 5, 6};
        int binary = a[a.length/2];
        int b=6;

        if (b==binary){
            System.out.println("找到");
        }if (b>binary){
            for (int i = (a.length/2+1);i<a.length;i++){
                if (b==a[i]){
                    System.out.println("在后面找到");
                }
            }
        }else {
            for (int i = 0;i<a.length;i++){
                if (b==a[i]){
                    System.out.println("在前面找到");
                }
            }
        }*/







    //}



   /* // a.查找数组中最大值
    static void maxNum() {
        int a[] = {1, 2, 3, 4, 5, 6};
        int n = a.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }*/

    //b.计算数组平均值

   /* static void avg() {
        int a[] = {1, 2, 3, 4, 5, 6};
        int n = a.length;
        double sum=0 ;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println(sum / n);

    }*/

   /* static void reversalArray() {
        double a[] = {1, 2, 3, 4, 5, 6};
        int n = a.length;
        for (int i = 0; i < n / 2; i++) {
            double temp = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = temp;
        }
        for (double i : a) {
            System.out.println(i);
        }
    }
*/
    static void arrayMethods() {
        double a[] = {1, 2, 3, 4, 5, 6};
        Arrays.sort(a);
       /* for (double k : a){
            System.out.println(k);
        }*/
      /*  double[] b = Arrays.copyOf(a, 5);
        for (double k : b) {
            System.out.println(k);
        }*/



    }
}