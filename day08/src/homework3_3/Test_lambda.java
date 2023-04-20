package homework3_3;
//有参有返回值抽象方法的练习
public class Test_lambda {
    public static void main(String[] args) {
        useAddable((int x, int y) -> {
            return x + y;
        });
    }

    private static void useAddable(Addable a) {
        int sum = a.add(10, 20);
        System.out.println(sum);
    }
}
