package com.hainiu;

import java.util.HashMap;

public class homework5_2 {
    public static void main(String[] args) {
        // 统计每个单词出现的次数。
        String str = "java world java javase big big data data data java hello world hello";
        String[] arr = str.split("\\s+");
        // 定义map集合
        HashMap<String, Integer> map = new HashMap<>( );
        // 遍历数组 以单词做键 以单词出现的次数做值
        for (String s : arr) {
            // 判断是否包含这个键
            if (!map.containsKey(s)) {
                // 如果不存在 值就是1
                map.put(s, 1);
            } else {
                // 如果存在 值+1
                map.put(s, map.get(s) + 1);
            }
        }
        // 遍历
        map.forEach((k, v) -> System.out.println("单词" + k + "出现了" + v + "次"));
    }
}

