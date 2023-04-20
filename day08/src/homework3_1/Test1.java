package homework3_1;
//无参无返回值抽象方法的练习
public class Test1 {
    public static void main(String[] args) {

        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("一天一苹果，医生远离我");
            }
        });
    }
    private static void useEatable(Eatable e) {
        e.eat();
    }
}

