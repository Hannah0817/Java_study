package hainiu;

import java.util.Scanner;

public class text4 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("请输入小明分数：");
        int b = a.nextInt();
        if (b >= 0 && b <= 59) {
            System.out.println("打");
        } else if (b >= 60 && b <= 69) {
            System.out.println("jiang1");
        } else if (b >= 70 && b <= 79) {
            System.out.println("jiang2");
        } else if (b >= 80 && b <= 89) {
            System.out.println("jiang3");
        } else if (b >= 90 && b <= 100) {
            System.out.println("jiang3");
        } else {
            System.out.println("错");
        }
    }
}