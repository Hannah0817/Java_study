package com.hainiu;

public class emo4 {
    public static void main(String[] args) {
        //捕获时异常
        try {
            int []arr= {1,2,3,4};
            System.out.println(arr[4]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
