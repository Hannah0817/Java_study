package com.hainiu.homemork3;

public class Test {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.setBrand("华为");
        smartPhone.setPrice(6999);

        smartPhone.play();
        smartPhone.open();

        DumbPhone dumbPhone = new DumbPhone();
        dumbPhone.call("xiaoli");
        dumbPhone.setPrice(2999);
    }
}
