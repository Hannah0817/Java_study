package homework;

import java.util.Arrays;

//11、String s = "11 110   20  25  18  17  15  22"
//    将其中的整数按照大小排序（Arrays.sort()）,组成一个新的字符串。
//    拆分成字符串数组
//    字符串数组转换为整数数组
//    排序
//    再把整数数组拼接成字符串（StringBuilder）
public class emo11 {
    public static void main(String[] args) {
        String str = "11 110   20  25  18  17  15  22";
        String[] arr = str.split("\\s+");
        int[] intarr = new int[arr.length];
        for (int i = 0; i < intarr.length; i++) {
            intarr[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(intarr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < intarr.length; i++) {
            sb.append(intarr[i]);
            if (i!= intarr.length - 1) {
                sb.append(" ");
            }
        }
        String s = sb.toString();
        System.out.println(s);
    }
}
