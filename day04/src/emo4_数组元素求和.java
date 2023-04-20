import java.util.Scanner;

public class emo4_数组元素求和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr= new int[5];

        for (int i = 0; i <arr.length ; i++) {
            System.out.println("请输入第一个元素"+(i+1)+"个元素，共计"+arr.length+"个");
            arr[i]=sc.nextInt();
        }
            int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }
        System.out.println("和为："+sum);
    }
}
