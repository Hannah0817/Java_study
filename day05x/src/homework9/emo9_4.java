package homework9;

public class emo9_4 {
    public static void main(String[] args) {

        uesSwimming(() -> {
            System.out.println("我们去狗刨吧");
        });
    }

    // 使用接口作为参数的场景
    public static void uesSwimming(swimmable swimming) {
        swimming.swim();
    }
}
