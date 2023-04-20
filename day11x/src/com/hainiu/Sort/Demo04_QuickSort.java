package com.hainiu.Sort;

import java.util.Arrays;

public class Demo04_QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8, 8, 8, 6, 3};
        quickSort (arr,0,arr.length-1);
        System.out.println ( Arrays.toString(arr));
    }
    public static void quickSort(int[]arr,int start,int end){
        //出口
        if (start<end){
            //一轮排序的过程  基准值归位
            //记录下来本轮参与排序的开始和结束位置
            int i  = start;
            int j = end;
            //记录本轮的基准值
            int pivot = arr[i];
            //循环找到这个基准的位置
            while (i < j) {
                //从右边找比基准值小的元素
                while (arr[j] >= pivot && i < j) {
                    j--;
                }
                //从左边找比基准值大的元素
                while (arr[i] <= pivot && i < j) {
                    i++;
                }
                //交换
                if (i < j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            //整个while循环结束 基准值找到了位置 就是i 基准值归位
            arr[start]=arr[i];
            arr[i]=pivot;
            //递归
            quickSort(arr,start,i-1);
            quickSort(arr,i+1,end);

        }
    }
}
