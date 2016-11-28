import java.util.Arrays;

/**
 * Created by LiuSitong on 2016/11/4.
 */
public class H {
    public static void main(String[] args) {
        /*int i=0;
        double [] a = new  double[1000];
        for (i=0;i<a.length;i++){
           a[i] = Math.random()*10;
          //  System.out.print(a[i]);
          //  System.out.print("  ");
        }
        Arrays.sort(a);
      *//* for (double k : a) {
           System.out.print(k);
           System.out.print("  ");
       }*//*
        System.out.print( Arrays.binarySearch(a,0.06982276522838338));*/



        int[] b = {1, 2, 5, 8, 4, 7, 5, 6, 9, 45};
        Arrays.sort(b);
        System.out.println( binarySearch2(b ,5));

    }

    static int binarySearch2(int[] b, int k) {

        int low = 0;
        int high = b.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (k < mid) {
                high = mid - 1;
            } else if (k > mid) {
                low = mid + 1;
            } else if (k == mid) {
                return mid;
            }

        }
        return -1;
    }




}
