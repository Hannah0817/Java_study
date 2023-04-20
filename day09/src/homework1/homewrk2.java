package homework1;

import java.util.Scanner;

//2、将键盘录入的电话号码中间四位隐藏，
public class homewrk2 {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入11位手机号码");
        String phoneNumber = sc.nextLine();
        //截取前三位，后四位，拼接四个星星
        String s1= phoneNumber.substring(0,3);
        String s2= phoneNumber.substring(7);
        String s = s1.concat("****").concat(s2);//链式编程
        System.out.println(s);
    }
}
