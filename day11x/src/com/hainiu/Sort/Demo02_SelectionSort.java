package com.hainiu.Sort;

import java.util.Arrays;

public class Demo02_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8, 8, 8, 6, 3};
 selectionSort ( arr );

     System.out.println( Arrays.toString ( arr));
    }
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
