package homework;

import java.math.BigDecimal;

//10、利用BigDecimal完成小数的精确运算
public class emo10 {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("1.1");
        BigDecimal b = new BigDecimal("0.8");
        BigDecimal c = a.add(b);
        System.out.println(c);

    }


}
