package day3作业;

//森林里有一只熊怪，很爱吃核桃。不过它有个习惯，每次都把找到的核桃分成相等的两份，吃掉一份，留一份。如果不能等分
// ，熊怪就会扔掉一个核桃再分。第二天再继续这个过程，直到最后剩一个核桃了，直接丢掉。
// 有一天，熊怪发现了1543个核桃，请问，它在吃这些核桃的过程中，它一共要丢掉多少个核桃。
public class emo8 {
    public static void main(String[] args) {
        int count = 0;
        int a =1543;
        while (a>0){

            if (a%2==1){
                count=count+1;
                a=a-1;

            }
            a/=2;
        }
        System.out.println(count);
    }

}
