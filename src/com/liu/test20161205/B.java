package com.liu.test20161205;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * Created by LiuSitong on 2016/12/7.
 * RandomAccessFile
 */
public class B {

    //将两个文件连接起来
    @Test
    public  void merage (){

        File file = new File("d:\\3.mp3");
        try {
            RandomAccessFile r = new RandomAccessFile("d://1.mp3","r"); //读
            RandomAccessFile w = new RandomAccessFile(file,"rw"); //写
            System.out.println(file.length());
            w.seek(file.length()-1024*1024);  //定位到3.MP3的末尾
            int n=-1;
            byte []buffer = new byte[1024];
            while ((n=r.read(buffer))!=-1){
                w.write(buffer,0,n);   //若是写成了 r.write  IOException 拒绝访问
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Test
    public void cut(){
        File file = new File("d://1.mp3");
        try {
            RandomAccessFile r = new RandomAccessFile(file,"rws");

           long i =  file.length()/5; //0--i i--2i
            r.seek(i);
            int n = -1;
            byte []buffer = new byte[1024];
            while ((n = r.read(buffer,1024*1024,1024*1024))!=-1){
                r.write(buffer,0,n);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }



}
