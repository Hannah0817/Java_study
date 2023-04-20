//5、递归算法 阶乘、斐波那契数列、汉诺塔、跳台阶、走迷宫
public class 作业5递归 {
    public static void main(String[] args) {
        jc(5);
        System.out.println(jc(5));
    }
    public static int jc(int n){
        if (n==1){
            return 1;
        }return jc(n-1)*n;
    }
}
