package com.hainiu;
//7、小牛买了一个存钱罐，他计划这样存钱：第一周存入10元，第二周存入20元，第三周存入30，依次每周递增10元。
//  请编写程序帮助小牛计算一下，一年（一年52周）之后，他的存钱罐中有多少钱？
public class homework7 {
    public static void main(String[] args) {
        int count = 1;
        int money = 10;
        int sunmoney= 0;
        while (count<=52){
            sunmoney+= money;
            //一定要会使用+=号！！！！！！！
            money += 10;
            count++;
        }
        System.out.println(sunmoney);

    }
}
