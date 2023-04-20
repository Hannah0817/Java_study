package homework;

import java.util.Scanner;

//2、键盘录入一个字符串 统计其中的英文字母有多少个？
public class emo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                count++;
            }
        }
        System.out.println(count);
    }
}
