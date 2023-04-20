package com.hainiu;
// 阶乘
public class Deno01 {
    public static void main(String[] args) {
       int num = jc(6);
       System.out.println(num);
    }
        public  static int  jc(int n) {
            if (n == 1) {
                return 1;
            }else  {
                return n * jc(n - 1);
            }

        }
}
