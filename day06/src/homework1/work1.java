package homework1;
//1、标准javabean的编写
public class work1 {
    private String name;
    private int age;
    private double shengao;

    public work1(String name, int age, double shengao) {
        this.name = name;
        this.age = age;
        this.shengao = shengao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getShengao() {
        return shengao;
    }

    public void setShengao(double shengao) {
        this.shengao = shengao;
    }

    public work1() {

    }
    public void play(){
        System.out.println("我爱玩游戏");
    }
}
