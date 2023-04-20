package homework3_1;

public class BasketballPlayer extends Player {
    public BasketballPlayer() {
    }
    public BasketballPlayer(String name,int year,int level){
        super(name,year,level);
    }

    @Override
    public void exercise() {
        System.out.println("篮球运动员练习打篮球");
    }

}
