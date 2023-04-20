package day3作业;

import java.util.Scanner;

//键盘录入一个年份，判断这个年份是否是闰年
public class emo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份");
        int day = sc.nextInt();
        if (day%4==0&&day%100!=0d||day%400==0){
            System.out.println("是闰年");
        }else {
            System.out.println("是平年");
        }
    }
}