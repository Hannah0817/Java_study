package com.hainiu;

import java.util.Random;
import java.util.Scanner;

//5、猜数字小游戏, 程序自动生成一个1-100之间的数字，使用程序实现猜出这个数字是多少？
public class homework5 {
    public static void main(String[] args) {
        Random random= new Random();
        int a = random.nextInt(100)+1;
        //还得整个键盘输入
        Scanner scanner= new Scanner(System.in);

        while (true){
            System.out.println("请输入您猜的数字：");
            int num = scanner.nextInt();
            if (num<a){
                System.out.println("猜小了，请继续猜");
            }else if (num>a){
                System.out.println("猜大了，接着继续猜");
            }else {
                System.out.println("bingo,猜对咯");
                break;
            }
        }
    }
}
