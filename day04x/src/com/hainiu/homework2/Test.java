package com.hainiu.homework2;

import com.sun.deploy.net.DownloadEngine;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("mimi");
        cat.setColor("狸花");

        cat.drink();
        cat.eat();

        Dog dog = new Dog("大黄","yellow");
        dog.drink();
        dog.eat();
    }
}
