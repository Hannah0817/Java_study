package homework1;
//1、自定义一个javabean 学生类，重写equals方法、hashCode方法、toString方法
//                            两个对象的属性值都想同，想等
public class emo1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(s1.equals(s2));

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1);
        System.out.println(s1.toString());
    }
}
