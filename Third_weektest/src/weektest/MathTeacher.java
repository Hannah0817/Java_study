package weektest;

public class MathTeacher extends Teacher {
    @Override
    public void teach() {
        System.out.println("我是教数学的");
    }

    public MathTeacher() {
    }

    public MathTeacher(String name, int age, String phoneNumber) {
        super(name, age, phoneNumber);
    }
}