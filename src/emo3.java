//3、假设某个比赛有6个评委打分，分数范围是（0-10），去掉一个最低分，去掉一个最高分，取平均分作为该选手的最终得分。


import java.util.Scanner;

public class emo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //定义数组用于存储这些成绩
        int[] arr = new int[6];
        //循环录入

        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第一个数" + (i + 1) + "个评委的分数");
            int score = sc.nextInt();
            if (score >= 0 && score <= 10) {
                arr[i] = score;
            } else {
                System.out.println("成绩有误，请重新输入");
                i--;//抵消下一次++操作
            }
        }
        int sum = getSum(arr);
        int max = getMax(arr);
        int min = getMin(arr);

        double avg = (sum - max - min) *1.0/ (arr.length - 2);
        System.out.println(avg);
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        return min;
    }
}