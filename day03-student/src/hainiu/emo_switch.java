package hainiu;

import java.util.Scanner;

public class emo_switch {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("请输入月份（1-12）：");
        int month = a.nextInt();
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("春天");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏天");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋天");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬天");
                break;
            default:
                System.out.println("月份有误");
                break;


        }
    }
}