package homework1;

//1、正则表达式讲义中的四个案例之校验
public class emo1 {
    public static void main(String[] args) {
//通过的邮箱标准：长度不限，可以使用英文（包括大小写）、数字、点号、下划线、减号，首字母必须是字母或者数字。
        String regex = "^[a-z0-9A-Z]+[-|a-z0-9A-Z._]+@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-z]{2,}$";
        //下面四个邮箱都是符合规则的有效数据
        String email1 = "xxxyyy@zzz.com.cn";
        String email2 = "xxx-yyy@zzz.com";
        String email3 = "xxx_yyy@zzz.n";
        String email4 = "88888@qq.com";
        System.out.println(email1.matches(regex));
        System.out.println(email2.matches(regex));
        System.out.println(email3.matches(regex));
        System.out.println(email4.matches(regex));

    }
}
