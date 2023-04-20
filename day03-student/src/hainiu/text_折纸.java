package hainiu;

public class text_折纸 {
    public static void main(String[] args) {
        double zf = 8844438;
        double paper = 0.1;
        int count = 0 ;

        while (paper<=zf){
            paper=paper*2;
            count++;
            System.out.println(count);
        }
    }
}
