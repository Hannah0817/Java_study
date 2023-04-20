
public class kaoshi {
    //第一天等于1
    //第二天等于2
    //第三天等于4
    //第四天等于8
    //以此类推
    //第10天，一共是多少？
    public static void main(String[] args) {
       int money = 1;//每天的钱数
       int sum = 0;//总钱
       int n = 10;//多少天
        for (int i = 1; i <=n; i++) {//循环多少天
            if (i==1){
                sum = sum+1;//第一天情况特殊
            }else if (i>1&&i<=n) {
                money = money * 2;
                sum += money;
            }else {
                break;
            }
        }
        System.out.println(sum);
    }
}