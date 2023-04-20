package com.hainiu;

import java.lang.reflect.Constructor;

public class Demo02 {
    public static void main(String[] args) throws Exception{
        //获取类的字节码对象
        Class<Student>clazz =(Class<Student>) Class.forName ( "com.hainiu.Student" );

        //
        Constructor<Student>construct = clazz.getConstructor ( String.class,int.class );
        System.out.println (construct );
        //使用公共构造创建对象
        Student student = construct.newInstance ( "tom",18 );
        System.out.println (student);


        //获取一个非公共构造
        Constructor<Student>constructor2 = clazz.getDeclaredConstructor ( String.class);
        System.out.println (constructor2 );

        //使用非公共构造创建对象
        constructor2.setAccessible ( true);//参数为true 设置可访问 取消java访问权限检查 暴力反射
        Student student2 = constructor2.newInstance ( "treey" );
        System.out.println (student2);
    }
}
