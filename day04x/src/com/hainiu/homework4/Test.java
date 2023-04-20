package com.hainiu.homework4;

public class Test {
    public static void main(String[] args) {
        //当发现某个方法需要，接口或抽象类的子类对象，我们就可以传递一个匿名内部类过去，来简化传统的代码

        //只用一次
        goswimming(new swimming(){
            @Override
            public void swim() {
                System.out.println("去游泳");
            }
        });
    }
    //参数是接口 传递一定是接口的实现子类对象
    public static void goswimming(swimming swimming){
        swimming.swim();
    }
}
