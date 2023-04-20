package 作业;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

//3. 小牛同学想买一个价值8888元的新手机，他的旧手机在二手市场能卖1880元，
//而手机专卖店推出以旧换新的优惠，把她的旧手机交给店家，新手机就能够打7.5折优惠。为了更省钱，小牛要不要以旧换新？
public class emo3 {
    public static void main(String[] args) {
        int a = 8888;
        int b = 1880;
        double c = 0.75;
        int x = a-b;
        double y =b*c;
        String z =x>y? "要以旧换新":"不要以旧换新";
        System.out.println(z);
    }



    }

