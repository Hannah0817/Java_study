package com.hainiu;

public class arrConcatTest {
    public static void main(String[] args) {
        int[] arr = {11, 33, 55, 77};
        int[] arr2 = {22, 44, 66, 88};
        int []concat = concat (arr, arr2 );
        for (int i = 0; i <concat.length ; i++) {
            System.out.println(concat[i]+"");
        }

    }

    public static int[] concat(int[] a, int[] b) {
        int length = a.length + b.length;
        int[] c = new int[length];
        int index = a.length;
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int j = 0; j < b.length; j++) {
            c[index] = b[j];
            index++;
        }
        return c;
    }
}
