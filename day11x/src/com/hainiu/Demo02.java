package com.hainiu;
//斐波那契数列   1	1	2	3	5	8	13	21	..
public class Demo02 {
    public static void main(String[] args) {
        System.out.println (fb ( 13 ) );
    }
    //递归求斐波那契数列的第n项
    public static int fb(int n){
        //前两个月兔子已知
        if(n==1){
            return 1;
        }else if(n==2){
            return 1;
        }else{
            return fb(n-1)+fb(n-2);
        }
    }
}
