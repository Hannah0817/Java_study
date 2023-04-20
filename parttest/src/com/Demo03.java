package com;
import java.util.Random;
import java.util.Scanner;
public class Demo03 {
    //2.猜数字小游戏
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(100)+1;
        while (true) {
            System.out.println("请输入一个数字：");
            int key =scanner.nextInt();
            if (key>num){
                System.out.println("大了");
            }else if (key<num){
                System.out.println("小了");
            }else if(key==num){
                System.out.println("猜对了");
                break;
            }
        }
    }
}
