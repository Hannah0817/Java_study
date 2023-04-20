package com;

import java.util.Scanner;

//输入一个字符串，输出其英文字符和数字字符的个数
public class hainiu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "请输入一个字符串：" );
        String str = scanner.nextLine ( );
        char[] chars = str.toCharArray ( );
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] >= 'a' && chars[i] <= 'z') || (chars[i] >= 'A' && chars[i] <= 'Z')) {
                count++;
            } else if (chars[i] >= '0' && chars[i] <= '9') {
                count2++;
            }
        }
        System.out.println ( "英文字符数量为：" + count );
        System.out.println ( "数字数量为：" + count2 );
    }
}
