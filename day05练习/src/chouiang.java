import java.util.Random;

public class chouiang {
    public static void main(String[] args) {
        int[]arr= {100,200,500,800,1000};
        Random random= new Random();
        int index = random.nextInt(arr.length);
        System.out.println("此次抽奖奖金为："+arr[index]);

    }
}
