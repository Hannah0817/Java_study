package com;

public class Demo09 {
    public static void main(String[] args) {
        //二维数组遍历，求年度营收额为
        int sum = 0;
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < arr.length; i++) {
            int season = 0;
            for (int j = 0; j < arr[i].length; j++) {
                 season +=arr[i][j];
            }
            sum += season;
            System.out.println(season + "jiduhe ");
        }
        System.out.println ("nian"+sum );
    }
}
