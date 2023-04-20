package homework1;

public class dog extends Animal {
    public dog(){
    }

    public dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println("小狗吃肉");
    }

}
