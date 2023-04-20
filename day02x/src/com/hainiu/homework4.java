package com.hainiu;
//4、折纸超过珠峰
public class homework4 {
    public static void main(String[] args) {
        int zhusan = 8844430;
        double zhi = 0.1;
        int count = 0;
        while (zhi < zhusan) {
            zhi = zhi * 2;
            count++;
        }
        System.out.println("折" + count + "次后折纸厚度将超越珠峰");
    }
}