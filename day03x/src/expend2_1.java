import java.util.Arrays;
import java.util.Scanner;

public class expend2_1 {
        public static void main(String[] args) {
            int[] arr = {11, 22, 33, 44, 55};
            int[] newArr = new int[arr.length + 1];
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入一个数");
            int a = scanner.nextInt();
            //找位置
            int index=0;
            //使用这个数据与数组中的元素依次比较
            for (int i = 0; i <arr.length ; i++) {
                if (a>arr[i]){
                    //大往后走
                    index++;
                    //原来的数据还放到原来的位置
                    newArr[i]=arr[i];
                }else {
                    //不大找不到位置了
                    //原来的数据放到索引+1的位置
                    newArr[i+1]=arr[i];

                }
            }
            //新元素归为
            newArr[index]=a;
            System.out.println(Arrays.toString(newArr));
    }
}
