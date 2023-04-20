package com.hainiu.Sort;

import java.util.Arrays;

public class Demo01_BubbleSor {
    public static void main(String[] args) {
        //冒泡排序
        int[] arr = {5, 1, 4, 2, 8, 8, 8, 6, 3};
        bubbleSort(arr);
            System.out.println( Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    public static void swap(int[] arr, int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
