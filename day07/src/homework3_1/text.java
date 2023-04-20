package homework3_1;

public class text {
    public static void main(String[] args) {
        PingPangPlayer ppp=new PingPangPlayer("tom",5,2);
        ppp.eat();
        ppp.exercise();
        ppp.sayEnglish();
        System.out.println(ppp.getName()+"----"+ppp.getYear()+"---"+ppp.getLeve1());
        useCoach(new BasketballCoach());
    }
    public static void useCoach(Coach coach){
        coach.trainting();
    }
}
