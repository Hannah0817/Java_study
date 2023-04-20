package com;

import java.util.Scanner;

//输入一个字符串，输出其英文字符和数字字符的个数
public class Demo01 {
    public static void main(String[] args) {
        //输入一个字符串，输出其英文字符和数字字符的个数
        Scanner scanner = new Scanner(System.in);
        System.out.println ("请输入一串字符串" );
        String str = scanner.nextLine();
        char[] chars = str.toCharArray ( );
        int count = 0;
        int count2 = 0;
        for (int i = 0; i <chars.length; i++) {
            if (( chars[i]>='a'&&chars[i]<='z' )||( chars[i]>='A'&&chars[i]<='Z' )){
                count++;
            }
            else if ( chars[i]>='0'&&chars[i]<='9' ){
                count2++;
            }

        }
        System.out.println ("字母有"+count+"个" );
        System.out.println ("数字有"+count2+"个" );


    }
}
