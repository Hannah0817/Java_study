package com.hainiu;

public class emo2 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s);
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println("------");
        s.name="tom";
        s.age=20;
        System.out.println(s.name);
        System.out.println(s.age);
    }

}
