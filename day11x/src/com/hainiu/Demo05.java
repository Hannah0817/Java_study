package com.hainiu;

import java.io.File;

public class Demo05 {
    //删除非空文件
    public static void main(String[] args) {
        File file = new File("C:\\Users\\高新廷\\Desktop\\123\\1234.txt");
        deleteDir(file);
    }
    public static void deleteDir(File dir) {
        //如果文件表示的路径不存在
        if (!dir.exists()) {
            return;
        }
            //如果是文件直接删
        if (dir.isFile()) {
            dir.delete();
            return;
        }
        //
        File[] files = dir.listFiles();
        if (files!=null){
            for (File file : files) {
                //
                if(file.isFile()){
                    file.delete();
                }else{
                    //如果是文件夹 递归
                    deleteDir ( file );
                }
            }
        }
        dir.delete();
    }
}
