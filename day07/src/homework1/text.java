package homework1;

public class text {
    public static void main(String[] args) {
        cat cat=new cat();
        cat.setName("加菲猫");
        cat.setColor("屎黄色");
        cat.eat();
        cat.drink();
        System.out.println(cat.getName());
        System.out.println(cat.getColor());
        System.out.println("-----");
        dog dog=new dog("旺财", "灰色");
        System.out.println(dog.getName());
        System.out.println(dog.getColor());

        dog.drink();
        dog.eat();
    }
}
