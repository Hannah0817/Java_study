package com.hainiu.homework2;

public class Dog extends Pet {
    public Dog() {
    }
    public Dog(String name,String color) {
        super(name,color);
    }
    @Override
    public void eat() {
        System.out.println(getName()+" 正在啃骨头");
    }
}
