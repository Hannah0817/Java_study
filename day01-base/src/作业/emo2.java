package 作业;
// 小牛想点一份外卖，商家的优惠方式如下：鱼香肉丝单点24元，优惠价16元，油炸花生米单点8元，米饭单点3元，订单满30元8折优惠。
//但是优惠价格和折扣不能同时使用。那么请问小牛要点这三样东西，最少要花多少钱？
public class emo2 {
    public static void main(String[] args) {
        int a = 24;
        int b = 8;
        int c = 3;
        int a1 =16;
        int x = a1+b +c;
        double y = (a+b+c)*0.8;
        String  z  = x>y? "最少需要"+y+"元":"最少需要"+x+"元";
        System.out.println(z);

    }


    }


