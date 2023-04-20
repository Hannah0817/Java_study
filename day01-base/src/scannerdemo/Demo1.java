package scannerdemo;


import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入第一个人的身高cm");
        int a= sc.nextInt();

        System.out.println("请输入第二个人的身高cm");
        int b= sc.nextInt();

        System.out.println("请输入第三个人的身高cm");
        int c= sc.nextInt();

        int t=a>b? a:b;

        int max = t>c? t:c;
        System.out.println("最大身高为；"+max
        );



    }
}
