package homework3_2;

public class Test2_lambda {
    public static void main(String[] args) {
        uesFlyable((String s)->{
            System.out.println(s);
            System.out.println("飞机自驾游");
        });
    }
    private  static void uesFlyable(Flyable f){
        f.fly("风和日丽，晴空万里");
    }
}
