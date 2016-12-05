package com.liu.test20161205;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;

/**
 * Created by LiuSitong on 2016/12/5.
 * 利用字节流和字符流的方法进行大文件的拷贝
 */
public class A {

    @Test
    public void  copy(){
        try(
                FileInputStream fis = new FileInputStream("c://1.wmv");
                FileOutputStream fos = new FileOutputStream("d://1.wvm")
        ){
            int n=-1;
            byte [] buffer = new byte[1024];
            long start = System.currentTimeMillis();
            while ( (n = fis.read(buffer))!=-1){  //当n是-1 就是结束
                fos.write(buffer,0,n);
            }

            SimpleDateFormat sdf = new SimpleDateFormat("mm:ss");
            long end = System.currentTimeMillis();
            System.out.println(sdf.format(end-start));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
