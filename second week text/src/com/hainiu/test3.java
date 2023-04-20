package com.hainiu;

public class test3 {
    public static void main(String[] args) {
        int[] a = {11, 33, 55, 77};
        int[] b = {22, 44, 66, 88};
        int[] newarr = new int[a.length + b.length];

        for (int i = 0; i < newarr.length; i++) {
            if (i < a.length) {
                newarr[i] = a[i];
            } else {
                newarr[i] = b[i - a.length];
            }
        }
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i]+" ");
        }
    }
}
