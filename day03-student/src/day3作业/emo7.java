package day3作业;

import java.util.Random;
import java.util.Scanner;

//7. 由系统随机生成一个1-100之间的随机数，猜数字。
public class emo7 {
    public static void main(String[] args) {

        Random rand = new Random();
        int randomnum = rand.nextInt(100);

        Scanner sc = new Scanner(System.in);
        System.out.println("猜数");

        while (true) {
            int num=sc.nextInt();

            if (num> randomnum) {
                System.out.println("大了");

            } else if (num < randomnum) {
                System.out.println("小了");

            } else {
                System.out.println("对了");
                break;
            }
        }

    }
}
