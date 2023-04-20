package com.hainiu;

public class emo2 {
    public static void main(String[] args) {
        String r = "T\\s*M\\s*D";
        String s = "你TMD真是个人才，别TMDh送了";
        String s1= s.replaceAll(r,"***");
        System.out.println(s1);
    }
}
