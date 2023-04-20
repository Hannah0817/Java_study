package com.hainiu;

public class test {
    public static void main(String[] args) {
        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {

            }
        });
        useFlyable((String s)->{

            System.out.println("起飞吧少年");
        });
    }


    private static void useFlyable( Flyable flyable) {
        flyable.fly("风和日丽，适合飞行");


    }
}
