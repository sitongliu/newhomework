import java.util.Scanner;

/**
 * Created by LiuSitong on 2016/11/9.
 */
public class L {
    public static void main(String[] args) {
        System.out.println("请输入要排序的个数：");
        Scanner scanner = new Scanner(System.in);
        int i= scanner.nextInt();
        int []a = new int[i];
        System.out.println("请输入要排序的数字 中间用空格分割");
        Scanner sc = new Scanner(System.in);
        for ( i=0;i<a.length;i++){
            int b = sc.nextInt();
            a[i]= b;

        }
        bubbleSort(a);
        for (int k :a) {
            System.out.print(k);
            System.out.print(" ");
        }
    }

    static void bubbleSort(int []a){
        for (int i= 0;i<a.length-1;i++){
            for (int j=0;j<a.length-1-i;j++){
                if (a[j]<a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

    }


}
