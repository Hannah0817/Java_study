package com.hainiu.Sort;

import java.util.Arrays;

public class Demo06_MergeSort {
    public static void main(String[] args) {
        //Demo06_MergeSort
        int[] arr = {5, 1, 4, 2, 8, 8, 8, 6, 3};
        mergeSort ( arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr) {
        // 准备临时空间
        int[] tempArr = new int[arr.length];
        mergeSort(arr, tempArr, 0, arr.length - 1);
        System.out.println( Arrays.toString(tempArr));
    }


    public static void mergeSort(int[] arr,int[]tempArr,int start,int end){
        //出口
        if(start<end){
            //拆解
            int mid = (start+end)/2;
            mergeSort(arr,tempArr,start,mid);
            mergeSort(arr,tempArr,mid+1,end);
            //合并已经安排好的数组  关心本轮需要合并的左右两个数组的位置
            //左边数组的起始位置
            int leftPos =start;
            //右边数组的起始位置
            int rightPos = mid+1;
            //左边数组的终止位置
            int leftEnd = mid;

            //右边数组的起始位置
            int rightStart = mid+1;
            //右边数组的终止位置
            int rightEnd = end;

            //本次参与排序的元素个数
            int elementMum = rightEnd -leftPos +1;

            //把已经排好的元素往临时空间合并
            //定义存储临时空间的索引
            int tempIndex = leftPos;
            while(leftPos<=leftEnd && rightPos<=rightEnd){
                if(arr[leftPos]<=arr[rightPos]){
                    tempArr[tempIndex++] = arr[leftPos++];
                }else{
                    tempArr[tempIndex++] = arr[rightPos++];
                }
            }
            while (leftPos<=leftEnd){
                tempArr[tempIndex++] = arr[leftPos++];
            }
            while (rightPos<=rightEnd){
                tempArr[tempIndex++] = arr[rightPos++];
            }
            //将临时空间的数据  拷贝到原数组
            for (int i = 0; i <elementMum ; i++,rightEnd--) {
                arr[rightEnd] = tempArr[rightEnd];
            }
        }
    }
}
