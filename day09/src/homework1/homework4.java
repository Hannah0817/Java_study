package homework1;
//4、将整数数组中的元素按照格式拼成一个字符串。参见stringbuilderdemo  Demo03
public class homework4 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        String s= arrayToString(arr);
        System.out.println(s);

    }
    //字符串拼接：
    //  字符串频繁改变，内存中的垃圾对象就越来越多
    public static String arrayToString(int[]arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i <arr.length ; i++) {
            sb.append(arr[i]);
            if (i<arr.length-1){
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
