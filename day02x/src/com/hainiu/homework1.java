package com.hainiu;

import java.util.Scanner;

//1、三元运算符获取三个数的最大值
public class homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int a = scanner.nextInt();
        System.out.println("请输入第二个数字");
        int b = scanner.nextInt();
        System.out.println("请输入第三个数");
        int c = scanner.nextInt();
        int x = a>b?a:b;
        int max = x>c? x:c;
        System.out.println("最大值为："+max);
    }
}
