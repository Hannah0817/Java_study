import java.util.Scanner;

//1、定义方法实现在数组中查找某个元素第一次出现的索引位置，如果不存在返回-1
public class emo1 {
    public static void main(String[] args) {
        int [] arr ={25,36,40,75,12,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的元素");
        int num =sc.nextInt();
        int index = getIndex(arr,num);
        System.out.println("索引是："+index);
    }
    public static int getIndex(int [] arr , int value) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==value) {
                return i;

            }
        }
        return -1;

    }
}

