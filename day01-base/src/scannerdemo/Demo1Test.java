package scannerdemo;

import sun.applet.Main;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.Scanner;

public class Demo1Test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入第一个人的身高：");
        int a = sc.nextInt();

        Scanner sc2= new Scanner(System.in);
        System.out.println("请输入第二个的身高：");
        int b = sc2.nextInt();

        Scanner sc3= new Scanner(System.in);
        System.out.println("请输入第二个的身高：");
        int c = sc3.nextInt();

        int t =a>b? a:b;
        int max = t>c? t:c;
        System.out.println(max);
    }
}
