package homework2;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        //学生的属性信息由键盘录入
        Student s =new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入名字");
        String name = sc.nextLine();
        s.setName(name);
        while (true){
            System.out.println("请输入年龄");
            String agestr = sc.nextLine();
            try {
                int age = Integer.parseInt(agestr);
                s.setAge(agestr);
                break;
            } catch (NumberFormatException e) {
                System.out.println("请输入一个整数");
                continue;
            }catch (AgeOutofboundsException e){
                System.out.println(e.toString());
                System.out.println("请输入一个符合范围的年龄");
                continue;
            }

        }
        System.out.println(s);
    }
}
