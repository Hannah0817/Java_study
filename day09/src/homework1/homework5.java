package homework1;

import java.util.Scanner;

//5、判断回文字符串 stringbuilderdemo  Demo04
public class homework5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        for (int i = 0; i <3 ; i++) {
            System.out.println("输入：");
            String s = scanner.nextLine();
            System.out.println(HuiWen(s));
        }
    }
    public static boolean HuiWen(String str){
        ////先把string转换为stringBuilder
        //StringBuilder builder= new StringBuilder(str);
        ////反转
        //builder.reverse();
        ////转回来
        //String revStr=builder.toString();
        ////于原串比较
        //return str.equals(revStr);
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
