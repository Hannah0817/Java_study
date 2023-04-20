package homework3_1;

public class PingPangPlayer extends Player implements SayEnglish{
    public PingPangPlayer() {
    }

    public PingPangPlayer(String name, int year, int leve1) {
        super(name, year, leve1);
    }

    @Override
    public void exercise() {
        System.out.println("乒乓球运动员练习打乒乓球");
    }

    @Override
    public void sayEnglish() {
        System.out.println("乒乓球运动员学习英文");
    }
}
