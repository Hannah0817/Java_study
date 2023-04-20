package homework;

import com.sun.org.apache.bcel.internal.classfile.Code;

import java.util.Random;
import java.util.Scanner;

//5、生成验证码  四位的字符串  可选字符包含母小写字母数字
//    通过索引操作数据
public class emo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("系统生产的验证码为：");
            String code = code();
            System.out.println(code);

            System.out.println("请输入验证码");
            String str = sc.nextLine();
            if (code.equalsIgnoreCase(str)) {
                System.out.println("验证通过");
                break;
            } else {
                System.out.println("验证失败，验证码刷新");
            }
        }
    }
        public static String code () {
            String str = "";
            for (char i = 'a'; i < 'z'; i++) {
                str += i;
            }
            for (char i = 'A'; i < 'Z'; i++) {
                str += i;
            }
            for (char i = '0'; i < '9'; i++) {
                str += i;
            }
            String code = "";
            Random rand = new Random();
            for (int i = 0; i < 4; i++) {
                int index = rand.nextInt(str.length());
                char c = str.charAt(index);
                code += c;
            }
            return code;
        }
    }
