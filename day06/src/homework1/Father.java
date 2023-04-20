package homework1;
//继承案例
public class Father {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Father(){}
    public Father(String name){
        this.name=name;
    }
    public void play(){
        System.out.println(name+"爱玩英雄联盟");
    }
}
