package homework3_1;

public abstract class Player extends Person{
    private int leve1;//级别
    public Player(){
    }
    public Player(String name,int year,int leve1){
        super(name, year);
        this.leve1=leve1;
    }

    public int getLeve1() {
        return leve1;
    }

    public void setLeve1(int leve1) {
        this.leve1 = leve1;
    }
    public abstract void exercise();
}
