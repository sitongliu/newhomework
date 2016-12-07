package com.liu.test20161205;

import org.jcp.xml.dsig.internal.SignerOutputStream;
import org.junit.Test;

import java.io.*;
import java.text.SimpleDateFormat;

/**
 * Created by LiuSitong on 2016/12/5.
 * 利用缓冲流 字节流和字符流的方法进行大文件的拷贝
 */
public class A {
    //BufferInputStream BufferOutputStream
    @Test
    public  void  copy2(){
            long s= System.currentTimeMillis();
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("c://1.wmv"),1024*1024);
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d://1.wmv"),1024*1024)) {

            byte []b = new byte[1024];
            int n= -1;
            while ((n=bis.read(b))!=-1){
                bos.write(b,0,n);
            }

            System.out.println("ok");
            SimpleDateFormat sdt = new SimpleDateFormat("mm:ss");
            long end = System.currentTimeMillis();
            System.out.println(sdt.format(end-s));


        } catch (Exception e) {
            e.printStackTrace();
        }


    }





    //字符流
    @Test
    public  void  copy1(){
        try( Reader reader = new FileReader("c://1.wmv");
             Writer writer = new FileWriter("d://1.wmw")
        ) {
            char []a = new char[1024*1024];
            int n = -1;
            while ((n=reader.read(a))!=-1){
                writer.write(a,0,n);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    //字节流的拷贝
    @Test
    public void  copy(){
        try(
                FileInputStream fis = new FileInputStream("c://1.wmv");
                FileOutputStream fos = new FileOutputStream("d://1.wvm")
        ){
            int n=-1;
            byte [] buffer = new byte[1024];
            long start = System.currentTimeMillis();
            while ((n = fis.read(buffer))!=-1){  //当n是-1 就是结束
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
