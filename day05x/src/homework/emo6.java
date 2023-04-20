package homework;
//6、判断一个字符串是否是回文
public class emo6 {
    public static void main(String[] args) {
        String str = "上海自来水来自海上";
        StringBuffer s = new StringBuffer(str);
        s.reverse();
        if (s.equals(str)){
            System.out.println("是回文");
        }else {
            System.out.println("不是回文");
        }
    }
}