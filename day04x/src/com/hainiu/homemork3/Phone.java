package com.hainiu.homemork3;
//3、抽象类接口案例
//    oop7包 手机体系
public abstract class Phone {
    private String brand;
    private double price;

    //抽象方法
    public abstract void call(String name);

    public void open(){
        System.out.println("启动设备");
    }
    public Phone(){

    }


    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
