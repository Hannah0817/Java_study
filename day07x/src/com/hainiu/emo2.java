package com.hainiu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//2、掌握使用字节流拷贝文件
public class emo2 {
    //使用byte[],实现AutCloseable接口对象能够成为try-with-resoureces语句的目标，自动释放资源，
    //将创建流对象的动作放入小括号中
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream ( "C:\\Users\\高新廷\\Desktop\\day07-io\\学习目标和作业.txt" );
             FileOutputStream fos = new FileOutputStream ( "D:\\javaProjects\\javase-study-49\\day07x\\a.txt" );
        ) {
            //读取操作仍然在try的大括号中
            //一次读取一个字节数组（缓冲区）
            byte[] b = new byte[1024];
            int len;
            while ((len = fis.read ( b )) != -1) {
                fos.write ( b, 0, len );
            }
        } catch (
                IOException e) {
            e.printStackTrace ( );
        }
    }
}