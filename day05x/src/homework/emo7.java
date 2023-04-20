package homework;
//7、完成数字和字符串的互换
public class emo7 {
    public static void main(String[] args) {
        //int number = 5;
        //String str = String.valueOf(number);
        //System.out.println(str);

        // 数字转字符串 method2
        int a = 5;
        Integer b = a;
        String c = b.toString();
        System.out.println(c);


        //字符串转数字
      String str = "123";
        int num =Integer.parseInt(str);
        System.out.println(num);
    }
}