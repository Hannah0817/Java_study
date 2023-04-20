package hainiu;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class text2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <=100 ; i++) {
            if(i%2==0){
                sum +=i;
            }
            System.out.println(sum);
        }
    }

}
