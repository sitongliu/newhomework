/**
 * Created by LiuSitong on 2016/11/7.
 */
public class J {

    public static void main(String[] args) {
        int []c ={4,6,2,9,5,3,8,66,33,88,22};
       // quickSort(c,0,c.length-1);
        bubbleSort(c);
       for (int o :c) {
            System.out.println(o);
        }

        System.out.println(binarySort(c,88));
    }

    //快排
    static void quickSort(int[]a ,int start,int end){
        int i = start;//i是从左边到右边的索引
        int j = end;//i是从右边到左边的索引

        if (i>=j){ // 两边重合了
            return;
        }
        boolean flag = true;
        while (i!=j){
            if (a[i]>a[j]){
                int temp = a[i];
                a[i]=a[j];
                a[j]=temp;
                flag =!flag;  //如果两个人交换了 那就转身去另一头找人交换
            }

            if(flag){
                j--;
            }else {
                i++;
            }
        }
        i--;
        j++;
        quickSort(a,start,i);
        quickSort(a,j,end);
    }

    //二分查找
    static int binarySort(int []a,int key){
        int low =0 ;
        int high= a.length-1;

        while (low<=high){
            int mid = (low+ high)/2; //mid 一定一定一定要放在while里面
            if (key>a[mid]){
                low = mid + 1;
            }else if(key<a[mid]){
                high = mid -1;
            }else {
                return mid;
            }
        }
        return -1;
    }



    //冒泡排序
    static void bubbleSort(int []a){
        for (int i = 0;i<a.length-1;i++){
            for (int j=0;j<a.length-1-i;j++){  //控制两个数比较
               if (a[j]>a[j+1]){
                   int temp = a[j];
                   a[j] =a[j+1];
                   a[j+1] = temp;
               }
            }
        }

    }


}
