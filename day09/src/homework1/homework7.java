package homework1;

import java.math.BigDecimal;

//7、实现浮点数的精确运算 参见 intergerdemo Demo04
public class homework7 {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("0.1");
        System.out.println(a);

        BigDecimal x = new BigDecimal("1.4");
        BigDecimal y = new BigDecimal("0.3");

        BigDecimal sum = x.add(y);
        double v = sum.doubleValue();
        System.out.println(v);

        //除法
        double s = add(1.1, 1.8);
        System.out.println(s);
    }

    public static double add(double a, double b) {
        BigDecimal b1 = new BigDecimal(String.valueOf(a));
        BigDecimal b2 = new BigDecimal(String.valueOf(b));
        BigDecimal sum = b1.add(b2);
        return sum.doubleValue();
    }
}
