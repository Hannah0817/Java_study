package Test;

import java.util.Scanner;

public class meo3 {
    public static void main(String[] args) {
        String name = "gxt";
        String password = "123456";

        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i <4 ; i++) {
            System.out.println("请输入账号：");
            String username = scanner.next();
            System.out.println("请输入密码：");
            String password1 = scanner.next();
            if(username.equals(name)&&password1.equals(password)){
                System.out.println("登录成功");
                break;
            }else {
                System.out.println("账号或者密码错误，请重新登录，您还有"+(5-1)+"次机会");
            }
        }

    }
}
