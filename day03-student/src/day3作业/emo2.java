package day3作业;

import java.util.Scanner;

//键盘录入一个成绩，判断这个成绩的等级。90~100 A；80~89 B；60~79 C；0~59 D
public class emo2 {
    public static void main(String[] args) {
        Scanner score = new Scanner(System.in);
        System.out.println("请输入一个成绩：");
        int a = score.nextInt();
        if (a >= 0 && a <= 59) {
            System.out.println("D");
        } else if (a >= 60 && a <= 79) {
            System.out.println("C");
        } else if (a >= 80 && a <= 89) {
            System.out.println("B");
        } else if (a >= 90 && a <= 100) {
            System.out.println("A");

        }else {
            System.out.println("输出有误");}
    }
    }