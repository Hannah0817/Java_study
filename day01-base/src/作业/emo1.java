package 作业;
//1. 已知小红同学有25元，她攒了几天钱之后发现现在的钱比原来的2倍还多出10块。
//而小蓝同学有30元，他攒了几天钱之后发现自己的钱正好是原来的2倍。
//于是小胖说：小红和小蓝现在的钱一样多，请问，他说的对吗？
public class emo1 {
    public static void main(String[] args) {
        int a = 25;
        int b = 30;
        int a1 = a*2+10;
        int b1 = b*2;
        boolean z = a1==b1? true:false;
        System.out.println(z);
    }
}

