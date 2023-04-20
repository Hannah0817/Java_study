package com.hainiu;

public class test {
    public static void main(String[] args) {

        for (int a=1000;a<10000;a++){
            int ge= a%10;
            int shi= a/10%10;
            int bai= a/100%10;
            int qian= a/1000%10;
            if (ge==qian&&bai==shi);
            System.out.println(a);
        }
    }
}
