package com.hainiu;

import java.util.Properties;

//5、使用Properties集合读取和写入属性信息
public class emo5 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("tom","hainiu");
        properties.setProperty("jerry","com");
        properties.setProperty("joke","18");

        properties.forEach ( (k,v)-> System.out.println ( k+"="+v) );
    }
}
