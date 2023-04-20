package com.hainiu;

import java.io.*;

//3、知道为什么使用字符流
//    查看文本不乱码
//    掌握缓冲字符流读取一行数据的方法
//    掌握缓冲字符流写出字符串和换行符的方法
public class emo3_1 {
    public static void main(String[] args) throws IOException {
       BufferedWriter bw = new BufferedWriter(new FileWriter ("day07x\\stu\\111.txt" ));
        bw.write("Hello\t");
        bw.write("Hello\t");
        bw.close ();

        BufferedReader br = new BufferedReader(new FileReader ( "day07x\\stu\\111.txt" ) );
        char[] chs = new char[1024];
        int len ;
        while ((len = br.read(chs)) != -1){
            System.out.println(new String(chs,0,len));
        }
        br.close();

    }
}
