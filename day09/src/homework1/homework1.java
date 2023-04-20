package homework1;

import java.util.Scanner;

//1、模拟用户登录，给出5次机会 参见stringdemo Demo02
public class homework1 {
    public static void main(String[] args) {
         //模拟用户登录操作
         //定义两个变量保持已经注册的用户名和密码
        String usenamer= "gaoxinting";
        String password= "123456";

        //键盘录入用户名和密码
        Scanner sc = new Scanner(System.in);
        //循环五次 比较 锁定
        for (int i = 0; i <5 ; i++) {
            System.out.println("请输入用户名：");
            String scUsername= sc.nextLine();
            System.out.println("请输入密码:");
            String scPassword= sc.nextLine();
            //比较
            if (usenamer.equals(scUsername)&&password.equals(scPassword)){
                System.out.println("欢迎");
                break;
            }else{
                System.out.println("用户名或者密码有误，请重写输入，您还可以尝试"+(5-i)+"次");
            }
        }
    }


}
