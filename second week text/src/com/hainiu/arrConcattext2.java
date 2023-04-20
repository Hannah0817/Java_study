package com.hainiu;

public class arrConcattext2 {
    public static void main(String[] args) {
        int[] arr = {11, 33, 55, 77};
        int[] arr2 = {22, 44, 66, 88};
        int[] newArr = new int[arr.length + arr2.length];
        for (int i = 0; i < newArr.length; i++) {
            if (i < arr.length) {
                newArr[i] = arr[i];
            } else {
                newArr[i] = arr2[i - arr.length];
            }
        }
        System.out.println("新数组为");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}

