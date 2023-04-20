package com.hainiu;

import java.util.Scanner;

//2、对输入的成绩作出判断 属于哪个等级
public class homwwork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个成绩：");
        int num = scanner.nextInt();
        if (num >= 90 && num <= 100) {
            System.out.println("甲");
        } else if (num >= 80 && num < 90) {
            //if 不能省略，只有最后一个if可以省
            System.out.println("已");
        }else if (num>=70&&num<=80){
            System.out.println("丙");
        }else if (num>=60&&num<70){
            System.out.println("丁");
        }else if (num>=0&&num<60){
            System.out.println("不合格");
        }else {
            System.out.println("输入错误，请重新输入");
        }
    }
}
