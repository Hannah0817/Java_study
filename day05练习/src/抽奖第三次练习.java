import java.util.Random;

public class 抽奖第三次练习 {
    public static void main(String[] args) {
        int []arr={100,200,300,400,500};
        Random random = new Random();
        int index = random.nextInt(arr.length);
        System.out.println(arr[index]);
    }
}
