package homework3_1;
//无参无返回值抽象方法的练习
public class Test2lambda {
    public static void main(String[] args) {
        uesEatable(()->{
            System.out.println("一天一苹果，医生远离我");
        });
    }
    private static void uesEatable(Eatable e){
        e.eat();
    }
}
