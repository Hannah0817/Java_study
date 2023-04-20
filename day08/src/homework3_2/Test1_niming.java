package homework3_2;

public class Test1_niming {
    public static void main(String[] args) {
        uesFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s);
                System.out.println("飞机自驾游");
            }
        });
    }
    private static  void uesFlyable(Flyable f){
        f.fly("风和日丽，清空万里");
    }
}
