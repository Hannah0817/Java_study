package com.hainiu;

import org.omg.CORBA.ARG_OUT;

import java.util.Scanner;

public class emo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int a= scanner.nextInt();

        System.out.println("请输入第一个整数");
        int b= scanner.nextInt();

        System.out.println("请输入第一个整数");
        int c= scanner.nextInt();

        int x = a>b?a:b;
        int max = c>x?c:x;

        System.out.println("最大数为："+max);


    }
}
