package homework1;

//1、正则表达式讲义中的四个案例之替换
public class emo2 {
    public static void main(String[] args) {
        String str = "张三的电话号码是：13877778888，李四的电话号码是：13966669999，王五的电话号码是：18898765432。";
        String regex = "1[3456789]\\d{9}";
        String reStr= str.replaceAll(regex,"****");
        System.out.println(reStr);
    }
}
