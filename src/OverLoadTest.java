/**
 * Created by LiuSitong on 2016/11/16.
 */
public class OverLoadTest {
    OverLoadTest(){}

    //一个参数的 4种
    OverLoadTest(int x){}
    OverLoadTest(float x){}
    OverLoadTest(String x){}
    OverLoadTest(char x){}

//   两个参数的12种
    OverLoadTest(int x,float y){}
    OverLoadTest(int x,char y){}
    OverLoadTest(int x,String y){}
    OverLoadTest(float x,int y){}
    OverLoadTest(float x,char y){}
    OverLoadTest(float x,String  y){}
    OverLoadTest(char x,int y){}
    OverLoadTest(char x,float y){}
    OverLoadTest(char x,String y){}
    OverLoadTest(String x,int y){}
    OverLoadTest(String x,float y){}
    OverLoadTest(String x,char y){}

//三个参数的24种
    OverLoadTest(int x,float y,String z){}
    OverLoadTest(int x,float y,char z){}
    OverLoadTest(int x,char y,float z){}
    OverLoadTest(int x,char y,String z){}
    OverLoadTest(int x,String y,char z){}
    OverLoadTest(int x,String y,float z){}
    OverLoadTest(float x,int y,String z){}
    OverLoadTest(float x,int y,char z){}
    OverLoadTest(float x,char y,int z){}
    OverLoadTest(float x,char y,String z){}
    OverLoadTest(float x,String y,char z){}
    OverLoadTest(float x,String y,int z){}
    OverLoadTest(char x,int y,String z){}
    OverLoadTest(char x,int y,float z){}
    OverLoadTest(char x,float y,int z){}
    OverLoadTest(char x,float y,String z){}
    OverLoadTest(char x,String y,float z){}
    OverLoadTest(char x,String y,int z){}
    OverLoadTest(String x,int y,char z){}
    OverLoadTest(String x,int y,float z){}
    OverLoadTest(String x,float y,int z){}
    OverLoadTest(String x,float y,char z){}
    OverLoadTest(String x,char y,float z){}
    OverLoadTest(String x,char y,int z){}
    //四个参数的24种
    OverLoadTest(int x,float y,String z,char k){}
    OverLoadTest(int x,float y,char k,String z){}
    OverLoadTest(int x,String z,float y,char k){}
    OverLoadTest(int x,String z,char k,float y){}
    OverLoadTest(int x,char y,float z,String k){}
    OverLoadTest(int x,char y,String k,float z){}
    OverLoadTest(char x,float y,String z,int k){}
    OverLoadTest(char x,float y,int k,String z){}
    OverLoadTest(char x,String z,float y,int k){}
    OverLoadTest(char x,String z,int k,float y){}
    OverLoadTest(char x,int y,float z,String k){}
    OverLoadTest(char x,int y,String k,float z){}
    OverLoadTest(float x,char y,String z,int k){}
    OverLoadTest(float x,char y,int k,String z){}
    OverLoadTest(float x,String z,char y,int k){}
    OverLoadTest(float x,String z,int k,char y){}
    OverLoadTest(float x,int y,char z,String k){}
    OverLoadTest(float x,int y,String k,char z){}
    OverLoadTest(String x,char y,float z,int k){}
    OverLoadTest(String x,char y,int k,float z){}
    OverLoadTest(String x,float z,char y,int k){}
    OverLoadTest(String x,float z,int k,char y){}
    OverLoadTest(String x,int y,char z,float k){}
    OverLoadTest(String x,int y,float k,char z){}


}
