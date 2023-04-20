package homework1;

//8、Math实现判断素数，（查找1000以内所有的素数）
public class homework8 {
    public static void main(String[] args) {
        int i,j,x=0;
        boolean f; 
        for(i=2;i<=1000;i++){
            f=true;
            for(j=2;j<i;j++){
                if (i % j == 0) {
                    f=false;
                }
            }
            if (f==true){
                System.out.print(i+"\t");
                x++;
                if(x%10==0){
                    System.out.println("");
                }
            }
        }
    }
}