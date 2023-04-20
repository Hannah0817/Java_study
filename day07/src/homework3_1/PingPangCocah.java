package homework3_1;

public class PingPangCocah extends Coach implements SayEnglish{
    public PingPangCocah() {
    }

    public PingPangCocah(String name, int year) {
        super(name, year);
    }

    @Override
    public void trainting() {

    }

    @Override


    public  void sayEnglish() {
        System.out.println("乒乓球教练说英文");
    }
}


