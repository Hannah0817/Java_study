package hainiu;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int x = a.nextInt();

        System.out.println("请输入第二个整数");
        int y = a.nextInt();

            int temp = x>y? x-y: y-x;
        System.out.println(temp);
    }
}
