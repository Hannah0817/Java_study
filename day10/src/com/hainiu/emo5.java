package com.hainiu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class emo5 {
    public static void main(String[] args) {
        //捕获编译时异常
        String s = "2022-02-22";
        //解析成日期对象
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM-dd");
        Date date = null;
        try {
            date = format.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("解析错误了");
        }
        System.out.println(date);
    }
}
