package Student;
import java.util.HashSet;
public class Test {
    public static void main(String[] args) {
    HashSet<Student> set = new HashSet<>();
    Student s1 = new Student("小李",18);
    Student s2 = new Student("小王",20);
    Student s3 = new Student("小张",16);
    Student s4 = new Student("小林",19);
    Student s5 = new Student("小红",17);
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
        System.out.println(set);
}
}
