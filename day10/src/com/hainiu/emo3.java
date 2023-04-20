package com.hainiu;

public class emo3 {
    public static void main(String[] args) {
        String s = "我..我..我...要...要...学...学....编....编...程..程...";
        String s1= s.replaceAll("\\.","");
        System.out.println(s1);
        String regex = "(.)\\1+";
        String s2 = s1.replaceAll(regex,"$1");
        System.out.println(s2);
    }
}
