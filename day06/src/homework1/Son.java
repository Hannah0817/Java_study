package homework1;

public class Son extends Father {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Son(String name){
        super(name);
        this.name = name;
    }
    public void play(){
        System.out.println(getName()+"爱玩原神");
    }
}
