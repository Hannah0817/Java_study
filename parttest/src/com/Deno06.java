package com;

import java.util.Scanner;

public class Deno06 {
    public static void main(String[] args) {
       // 输入一串英文文字计算其长度
        Scanner scanner = new Scanner(System.in);
        System.out.println ("请输入一窜英文文字：" );
        String str = scanner.nextLine();
        char[] chars = str.toCharArray ( );
        System.out.println ("该文本长度为"+chars.length );

    }
}
