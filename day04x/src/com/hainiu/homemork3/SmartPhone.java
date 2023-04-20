package com.hainiu.homemork3;

public class SmartPhone extends Phone implements PlayGame{
//屏幕尺寸
        private String size;

        public SmartPhone(){
                   }
    public SmartPhone(String brand, double price, String size) {
            super(brand, price);
            this.size = size;
        System.out.println("这部手机价格为："+price);

    }

    @Override
    public void call(String name) {

    }

    @Override
    public void play() {

    }
}
