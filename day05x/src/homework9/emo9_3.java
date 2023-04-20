package homework9;

public class emo9_3 {
    public static void main(String[] args) {
        useFlyable(s -> System.out.println(s));
    }

    private static void useFlyable(Flyable f) {
        f.fly("风和日丽，晴空万里");
    }

}

