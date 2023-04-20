package com.hainiu;

import javax.sound.sampled.Line;
import java.io.*;

//3、知道为什么使用字符流
//    查看文本不乱码
//    掌握缓冲字符流读取一行数据的方法
//    掌握缓冲字符流写出字符串和换行符的方法
public class emo3_2 {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输入流
        BufferedWriter bw = new BufferedWriter ( new FileWriter ( "myCharStream\\bw.txt" ) );
        //写数据
        for (int i = 0; i < 10; i++) {
            bw.write ( "hello" + i );
            //bw.write("\r\n");
            bw.newLine ( );
            bw.flush ( );
        }
        bw.close ( );
        //创建字符缓冲输入流
        BufferedReader br = new BufferedReader ( new FileReader ("myCharStream\\bw.txt") );
        String line ;
        while ((line = br.readLine ())!= null) {
            System.out.println ( line );
        }
        br.close();
}
}
