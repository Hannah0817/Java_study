package hainiu;

public class zhezhi {
    public static void main(String[] args) {
        double zf = 8844430;
        double paper = 0.1;
        int count = 0;
        while (paper<=zf){
            paper *= 2;
            count++;
        }
        System.out.println(count);
    }
}
