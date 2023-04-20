package com.hainiu;

public class Demo3 {
    public static void main(String[] args) {
        int h1=165;
        int h2=190;
        int h3=165;
        int temp=h1>h2? h1:h2;
        int max=temp>h3? temp:h3;
        System.out.println(max);
    }
}
