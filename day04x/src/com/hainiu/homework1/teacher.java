package com.hainiu.homework1;

public class teacher extends person{
    public teacher() {
    }
    public teacher(String name, int age) {
        super(name, age);
        System.out.println(name);
        System.out.println(age);
    }
}

