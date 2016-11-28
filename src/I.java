/**
 * Created by LiuSitong on 2016/11/4.
 */
public class I {

    public static void main(String[] args) {

        int [][] a = {{2,5},
                {1,4}};
        int [][] b ={{4,5},
                {8,7}};
        //矩阵的加法
      //  add(a,b);
        //矩阵的减法
      //  sub();
        //矩阵的乘法
        mult(a,b);
    }

     static void add(int [][]a,int[][]b){

         int [][] c=new int[a.length][a[0].length];
         for(int i= 0 ;i<a.length;i++){
             for(int j =0 ;j<a[0].length;j++){
                  c[i][j] = a[i][j]+b[i][j];
                 System.out.print(c[i][j]);
                 System.out.print("  ");
             }
         }
    }


    static  void mult(int [][]a,int[][]b){
        int [][] c=new int[a.length][b[0].length];
          for (int i =0 ;i<a.length;i++){
              int j=0;
              for ( j= 0 ;j<b[0].length;j++){
                  int temp =0;
                  for (int k= 0;k<b.length;k++){
                       temp +=a[i][k]*a[k][j];
                  }
                  c[i][j]=temp;
                  System.out.print(c[i][j]);
                  System.out.print("  ");
              }

          }

    }

}
