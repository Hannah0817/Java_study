package homework;

import java.sql.SQLOutput;
import java.util.Scanner;

//3、模拟用户登录
public class emo3 {
    public static void main(String[] args) {
        String username = "gxt";
        String password = "123456";
        //键盘录入
        Scanner sc = new Scanner(System.in);
        //登录五次
        for (int i = 1; i < 5; i++) {
            System.out.println("请输入用户名：");
            String name = sc.nextLine();
            System.out.println("请输入密码：");
            String pwd = sc.nextLine();
            if (name.equals(username) && pwd.equals(password)) {
                System.out.println("登录成功");
                break;
            } else  {
                System.out.println("用户名或者密码错误，请重新输入，还有" + (5 - i) + "次机会");

            }
        }
    }
}