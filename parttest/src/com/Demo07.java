package com;

import java.util.Scanner;

public class Demo07 {
    public static void main(String[] args) {
        //评委打分案例（求最值 求和）
        int []array = new int[6];
        for (int i = 1; i <= 6; i++) {
            Scanner scanner = new Scanner( System.in);
            System.out.println("第"+i+"个评委打分为：");
            array[i-1] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("求和为："+sum);

        //求最大值
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("求最大值为："+max);

        //求最小值
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("求最小值为："+min);


        //最终成绩为
       double score = (sum-max-min)/4;
        System.out.println("最终成绩为："+score);
    }
}
