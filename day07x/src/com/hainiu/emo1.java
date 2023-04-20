package com.hainiu;

import java.io.File;

//1、掌握File类的常用API
//    练习时注意：测试文件夹，因为删除不走回收站。
public class emo1 {
    public static void main(String[] args) {
        //获取文档
        File file = new File("C:\\Users\\高新廷\\Desktop\\新建文件夹\\01-java编程环境搭建.md");

        File[] files =file.listFiles();
        if (files!=null ){
            for (File f : files) {
                if (f.isFile ()&&f.getName ().endsWith(".md")){
                    System.out.println(f.getAbsolutePath ());
                }
            }
        }
    }
}
