package homework3_1;

public class BasketballCoach extends Coach {
    public BasketballCoach(){
    }
    public BasketballCoach(String nmae,int year){
        super(nmae,year);
    }
    @Override
    public void trainting() {
        System.out.println("篮球教练指导如何打篮球");
    }
}
