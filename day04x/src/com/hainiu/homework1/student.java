package com.hainiu.homework1;

public class student extends person{
    private String color;


    public student(String color) {
        this.color = color;
    }

    public student(String name, int age, String color) {
        super(name, age);
        this.color = color;
        System.out.println("我的名字是"+name+"年纪是"+age+"肤色是"+color);

    }

    public student() {
    }

    }

