import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Random;

public class 抽奖再练习 {
    public static void main(String[] args) {
        int []arr= {100,200,300,500,400};
        Random random = new Random();
        int index = random.nextInt(arr.length);
        System.out.println(arr[index]);
    }

}
