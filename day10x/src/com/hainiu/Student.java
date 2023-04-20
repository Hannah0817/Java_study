package com.hainiu;

public class Student {
    private String name;
    private int age;
    //省略构造方法和getter setter


    public static void main(String[] args) throws Exception {
        //
        //
        //public static class<?>former(String classNanme)--全限定；类名（包名+类名）——

        //
        Class<Student>clazz1 = (Class<Student>)
                Class.forName("com.hainiu.Student");
        System.out.println (clazz1 );


        //数据类型.class属性
        Class<Student> clazz2 =Student.class;
        System.out.println (clazz2 );


        //
        Student s = new Student();
        Class<Student> clazz3 =(Class<Student>)s.getClass ();
        System.out.println (clazz3 );
        //无论那种方式  获取的字节码对象是相同的
}
}
