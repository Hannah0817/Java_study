package com.hainiu;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Demo03_Filed {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        //获取类的字节码对象
        Class<Student>clazz = (Class<Student>) Class.forName("com.hainiu.Student");
        //
        Student student = clazz.getDeclaredConstructor ().newInstance();
        //
        Field nameField = clazz.getDeclaredField("name");
        //
        nameField.setAccessible(true);
        nameField.set(student,"tom");
        Object value = nameField.get(student);
        System.out.println(value);
        System.out.println ("------" );
        Field ageField = clazz.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(student,18);
        Object v2 = ageField.get(student);
        System.out.println(v2);

        System.out.println ("==" );
        System.out.println (student );
    }
}
