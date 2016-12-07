package com.liu.test20161205;

import java.io.*;

/**
 * Created by LiuSitong on 2016/12/7.
 * 文件的拷贝 带有文件夹的
 */
public class F {

        public static void main(String[] args) {
            copy("E://mytest","d://205");
            System.out.println("文件拷贝完成!");
        }

        private static void copy(String sourcepath, String target) {
            File file1=new File(sourcepath);
            File[] fs=file1.listFiles();
            File file2=new File(target);
            if(!file2.exists()){
                file2.mkdirs();
            }
            for (File f : fs) {
                if(f.isFile()){
                    fileCopy(f.getPath(),target+"\\"+f.getName()); //调用文件拷贝的方法
                }else if(f.isDirectory()){
                    copy(f.getPath(),target+"\\"+f.getName());
                }
            }

        }

        /**
         * 文件拷贝的方法
         */
        private static void fileCopy(String src, String des) {

            BufferedReader br=null;
            PrintStream ps=null;

            try {
                br=new BufferedReader(new InputStreamReader(new FileInputStream(src)));
                ps=new PrintStream(new FileOutputStream(des));
                String s=null;
                while((s=br.readLine())!=null){
                    ps.println(s);
                    ps.flush();
                }

            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }finally{

                try {
                    if(br!=null)  br.close();
                    if(ps!=null)  ps.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }


        }

    }



