package homework3_3;

//有参有返回值抽象方法的练习
public class Test1_niming {

    public static void main(String[] args) {
        //匿名类
        useAddable(new Addable() {
            @Override
            public int add(int x, int y) {
                return x+y;
            }
        });

    }

    private static void useAddable(Addable a) {
        int z = a.add(10, 20);
        System.out.println(z);
    }
}

