package hainiu;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("请输入一个三位数整数");
        int number = a.nextInt();

        int bai = number/100%10;
        int shi = number/10%10;
        int ge  = number%10;

        int temp = bai+shi+ge;
        System.out.println(temp);

    }

}
