/**
 * Created by LiuSitong on 2016/11/12.
 */
public class M {
    public static void main(String[] args) {
        int []c = {7,8,5,4,6,9,1,3,2};
        //快排
        quickSort(c,0,c.length-1);
     /*  for (int k :c){
            System.out.println(k);
        }*/
        //二分查找
        System.out.println(binarySearch(c,9));

    }

    /**
     *
     * @param a
     * @param key 将要查找的目标数字
     * @return
     */
    public  static int binarySearch(int []a,int key){

        int low = 0;
        int height= a.length-1;

        while (low <=height){
            int mid = (low+height)/2;
            if (key > a[mid]){ //查找的目标大于中间值得话，那就是在数组中间和末尾这个区域
                low = mid+1;
            }else if (key <a[mid]){
                height =mid-1;
            }else if (key == a[mid]){
                return mid;
            }
        }
        return -1; //如果没有找到的话那就返回-1；
    }

    /**
     *
     * @param a 传入的数组
     * @param start 从左边开始的位置 赋值给i i++ 代表的是从左边闲右边走查找
     * @param end 从右边开始的位置 赋值给j  j-- 代表是从右边向左边走查找
     */
    public static void quickSort(int []a,int start,int end){
        int i= start;
        int j= end;

        if (i>=j){ //如果 索引i大于j的话 那就是两边都查找完毕 跳出循环
            return;
        }
        boolean flag = true; //设置一个标志 从右边往左边走 代表true；
        while (i<j) {
            if (a[i] > a[j]) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                flag = !flag; //如果交换成功 那么就换方向
            }
            if(flag){ //要把这句话放在while 里面不然就死循环了 i永远是0 ，j永远是a.length - 1;
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

}
