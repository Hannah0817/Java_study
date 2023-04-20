package day3作业;

import java.util.Scanner;

//4. 某客服系统有服务满意度反馈系统，输入数字1、2、3、4分别表示非常满意、基本满意、不太满意、非常不满意；请使用程序实现该效果。
public class emo4 {
    public static void main(String[] args) {
        Scanner score = new Scanner(System.in);
        System.out.println("请输入一个分数对本次服务打分（1、2、3、4分别表示非常满意、基本满意、不太满意、非常不满意）：");
        int x = score.nextInt();
        if (x==1){
            System.out.println("非常满意");
        }else if (x==2){
            System.out.println("基本满意");
        }else if (x==3){
            System.out.println("不太满意");
        }else if (x==4){
            System.out.println("非常不满意");
        }else {
            System.out.println("输入错误");
        }
    }
}
