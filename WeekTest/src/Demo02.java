import java.util.Random;

public class Demo02 {
    public static void main(String[] args) {
        //二、体彩中有一项是双色球，要求在1-33号共33个红色球里选出6个，1-16号共16个蓝色球中选出一个作为中奖号码，
        Random random1 = new Random();//创建随机数组
        int []arr1 = new int[6];//选六个元素
        System.out.print("红球：[" );
        for (int i = 0; i < 6; i++) {//遍历
            arr1[i] = random1.nextInt(33)+1;//不加1，不会随机到33
            System.out.print(arr1[i]+"\t");
        }
        System.out.println("]" );//打印

        Random random2 = new Random();
        int []arr2= new int[6];
        System.out.print("黑球：[" );
        for (int i = 0; i < 1; i++) {
            arr1[i] = random1.nextInt(16)+1;
            System.out.print(arr1[i]+"\t");
        }
        System.out.println ("]" );

    }
}
