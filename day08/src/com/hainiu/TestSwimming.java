package com.hainiu;

public class TestSwimming {
    public static void main(String[] args) {
        goSwimming(new Swimming(){
        @Override
        public void swim () {
            System.out.println("womenyouyong");}

        });
    }
    /**
     * 使用接口的方法
     */
    public static void goSwimming(Swimming swimming){
        /*
            Swimming swim = new Swimming() {
                @Override
                public void swim() {
                    System.out.println("铁汁, 我们去游泳吧");
                }
            }
         */
        swimming.swim();
    }
}