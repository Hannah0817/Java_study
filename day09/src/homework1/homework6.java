package homework1;

//6、"12 56 34 112 23 66 11 18 35" -- 把其中的数据按照从小到大的顺序排列 组成一个新的字符串 参见 intergerdemo Demo03
//    通过这个案例掌握 字符串与整数之间的互换
public class homework6 {
    public static void main(String[] args) {
        String str = "12 56 34 112 23 66 11 18 35";
        String[] strArr =str.split(" ") ;
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < intArr.length; i++) {
            sb.append(intArr[i]);
            if (i < intArr.length - 1) {
                sb.append(" ");
            }
        }
        String result = sb.toString();
        System.out.println(result);
    }
}
