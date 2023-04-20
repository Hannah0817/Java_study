package com.hainiu;

public class emo1 {
    public static void main(String[] args) {
        String regex = "1[3|5-9]\\d{9}";
        String str = "张三的电话号码是：13712345678,李四的手机号码是13887456321";
        String result = str.replaceAll(regex,"****");
        System.out.println(result);

    }
}
