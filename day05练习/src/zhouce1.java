public class zhouce1 {
    //回文数是指正读反读都一样的数字。
    //  设n是一任意自然数，若将n的各位数字反向排列所得自然数n1与n相等，则称n为一回文数。
    //  例如，若n=1234321，则称n为一回文数；但若n=1234567，则n不是回文数。
    //  请编程查找所有的四位数的回文数。
    public static void main(String[] args) {
        int n = 1000;
        while (n >= 1000 && n < 10000) {
            int ge=n%10;
            int shi=n/10%10;
            int bai= n/100%10;
            int qian= n/1000%10;
            if (qian==ge&&bai==shi){
            //if ((n / 1000 % 10 == n % 10) && (n / 100 % 10 == n / 10 % 10)) {
                System.out.println(n);

            }
            n++;
        }
    }
}


