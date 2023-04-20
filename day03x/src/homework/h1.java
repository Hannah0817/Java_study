package homework;

import java.util.Scanner;

//1、评委打分案例（求最值 求和）
public class h1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//分得手动输入
        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个数");
            int score = scanner.nextInt();
            if (score >= 0 && score <= 10) {
                arr[i] = score;
            } else {
                System.out.println("请输入正确的分数");
                i--;
            }
        }
            int max = arr[0];
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            int min = arr[0];
            for (int k = 0; k < arr.length; k++) {
                if (arr[k] < min) {
                    min = arr[k];
                }
            }
            int sum= 0;
        for (int i = 0; i <arr.length ; i++) {
            sum +=arr[i];
        }
            System.out.println("和为："+sum);

            System.out.println("最大值为:"+max);
            System.out.println("最小值为："+min);
        }
    }
