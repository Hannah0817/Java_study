import java.util.Random;
//6、数组中随机选取元素
//2、编写一个随机抽奖的程序，程序运行之后，会多次抽奖，每次从奖池中随机抽取到一个奖金，直到奖金全部被抽出，而且每次抽取到的金额不会重复
public class 抽奖2金额不会重复 {
    public static void main(String[] args) {
        int[]arr={100,200,500,800,1000};
        Random random= new Random();
        int count = 0;
        while (count<arr.length){
            int index = random.nextInt(arr.length);
            if (arr[index]==0){
                continue;
            }
            System.out.println("第"+(count+1)+"次抽到的奖金是："+arr [index]);
            arr [index]=0;
            count++;
        }
    }
}

