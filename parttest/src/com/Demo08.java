package com;

public class Demo08 {
    public static void main(String[] args) {
        //倒着遍历一个数组
        int []arr = {0,1,2,3,4,5,6,7,8,9};
       for (int i = arr.length-1; i >=0; i--){
            System.out.println(arr[i]);
        }


    }
}
