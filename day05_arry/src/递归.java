public class 递归 {
    public static void main(String[] args) {

        System.out.println(jc(33));
    }
    public static int jc(int n ){
        if (n==1){
            return 1;
        }
        return jc(n-1)*n;
    }
}
