package com.liu.test20161205;

import org.junit.Test;

import java.io.File;

/**
 * Created by LiuSitong on 2016/12/7.
 */
public class C {

    @Test
    public  void  test(){
        findMyfile("e://205");
    }
    public void findMyfile(String path) {
        File myfile = new File(path);
      //  System.out.println(myfile.isDirectory());
      //  String []file = myfile.list();  // QQ
        File []file2 = myfile.listFiles(); // C:\Tencent\QQ
        int num =0;
        for (File i: file2) {
            if (i.isDirectory()){
                findMyfile(i.getPath());
            }
            System.out.println(i.getPath());
        }
        System.out.println(num);
    }


}
