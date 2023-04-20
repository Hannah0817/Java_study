package com.hainiu;

//10、20元，买可乐，3元一瓶，一个空瓶子能退1元，请问能买多少瓶？？ 不允许赊账。
//
//编程语言描述数学场景。
public class homework10 {
    public static void main(String[] args) {
        int money = 20;
        int price = 3;
        int temp = 0;//一次购买可乐瓶数
        int change = 0;//每次买完可乐剩下的钱
        int sum= 0;//总可乐瓶数
        while (money >= 3) {
            temp= money/price;
            sum+=temp;
            change= money%price;
            money=temp+change;
        }
        System.out.println(sum);
        }

    }

