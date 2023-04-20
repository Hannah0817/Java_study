package com.hainiu.homemork3;

public class DumbPhone extends Phone implements Help{
    public DumbPhone(){
    }
    public DumbPhone(String brand, double price){
        super(brand, price);
    }

    @Override
    public void help() {

    }

    @Override
    public void call(String name) {

    }
}
