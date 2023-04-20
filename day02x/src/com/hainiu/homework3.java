package com.hainiu;
//3、水仙花数案例
public class homework3 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i <1000 ; i++) {
            int bai= i/100%10;
            int shi= i/10%10;
            int ge= i%10;
            if (bai*bai*bai+shi*shi*shi+ge*ge*ge==i){
                System.out.println(i);
                count++;
            }

        }
        System.out.println("水仙花数的个数为"+count);
    }
}
