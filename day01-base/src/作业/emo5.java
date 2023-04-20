package 作业;

import java.util.Scanner;

// 动物园里新来了三只老虎，他们的体重由键盘录入（单位kg，仅录入数值即可），请用程序实现获取这三只老虎的最小体重。
public class emo5 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("1");
        int w1 = a.nextInt();

         System.out.println("2");
        int w2 = a.nextInt();

         System.out.println("3");
        int w3= a.nextInt();

        int temp = w1>w2? w1:w2;
        int max = w3>temp? w3:w2;
        System.out.println(max);

    }
}
