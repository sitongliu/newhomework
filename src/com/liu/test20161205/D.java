package com.liu.test20161205;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by LiuSitong on 2016/12/7.
 * 文件夹里面的文件的复制
 */
public class D {

    public  void  findpath(String path){
        String newfile = null;
        File file = new File(path);
        File file2 = new File("D://");
        File []files = file.listFiles();
        for (File o: files) {
            if (o.isDirectory()){
                findpath(path);
               // file2.mkdir(o.getPath());
            }
            String mypath = o.getPath();
            String filename =  file2.getName();

            try (FileInputStream fis = new FileInputStream(mypath);
                 FileOutputStream fos = new FileOutputStream(filename)){
                int n=-1;
                byte []buffer = new byte[1024];
                while ((n=fis.read(buffer))!=-1){
                    fos.write(buffer,0,n);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }


        }
    }


    public void copy(){



    }
}
