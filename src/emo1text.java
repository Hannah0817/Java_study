import java.util.Scanner;

public class emo1text {
    ////1、定义方法实现在数组中查找某个元素第一次出现的索引位置，如果不存在返回-1
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想要查找的元素");
        int num = sc.nextInt();
        int index=GetIndex(arr,num);
        System.out.println("索引是"+index);

    }
        public  static int GetIndex(int[]arr,int valub){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]==valub)
                return i;
            }
            return -1;
        }

}
