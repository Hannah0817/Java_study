package com.hainiu.Sort;

import java.util.Arrays;

public class Demo03_InsertSort {
    public static void main(String[] args) {
    //插入排序：当前元素插入前面已排序的序列合适的位置
        int[] arr = {5, 1, 4, 2, 8, 8, 8, 6, 3};
        insertSort(arr);
        System.out.println ( Arrays.toString ( arr ) );
    }
    public static void insertSort(int[] arr){
        //外循环控制总的比较次数
        for (int i = 1; i < arr.length; i++) {
            //内循环控制元素插入的位置 反向扫描
            for (int j = i-1; j >=0 ; j--) {
                if (arr[j+1] <arr[j]){
                    //比它前面的元素小 就交换
                    Demo01_BubbleSor.swap(arr,j+1,j);
                }else{
                    //不小 就找到了插入的位置 内循环停止
                    break;
                }
            }
        }
    }
}
