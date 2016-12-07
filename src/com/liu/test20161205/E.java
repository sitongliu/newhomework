package com.liu.test20161205;

import org.junit.Test;

import java.io.File;

/**
 * Created by LiuSitong on 2016/12/7.
 *利用renameTo进行文件的转移 不能有文件夹
 */
public class E {
    @Test
    public void testmove(){
        movefile("E://205","D://new");
    }

    public boolean movefile(String sourcePath,String targetPath){
        try {
            File sourceDir = new File(sourcePath);
            if (sourceDir.exists()){
                for (File file: sourceDir.listFiles()) {
                    File targetFile = new File(targetPath,file.getName());
                    file.renameTo(targetFile);
                }
            }
            return  true;
        }catch ( Exception e){
            e.printStackTrace();
            return false;
        }

    }
}
