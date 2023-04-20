package homework1;

import java.util.Arrays;

//1、正则表达式讲义中的四个案例之拆分
public class emo3 {
    public static void main(String[] args) {
        String str = "11  22  33    44 88";
        String[]strs= str.split("\\s+");
        System.out.println(Arrays.toString(strs));
    }
}
