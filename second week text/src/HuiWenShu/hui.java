package HuiWenShu;

public class hui {
    public static void main(String[] args) {
        for (int i = 1000; i <10000 ; i++) {
            int ge= i%10;
            int shi= i/10%10;
            int bai= i/100%10;
            int qian= i/1000%10;
            if(qian==ge&&shi==bai){
                System.out.println(i);
            }
        }
    }
}
