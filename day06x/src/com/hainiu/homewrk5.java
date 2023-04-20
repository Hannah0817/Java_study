package com.hainiu;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//5、Map集合练习map包下的Demo02和03
public class homewrk5 {
    public static void main(String[] args) {
        //通过键找值
        HashMap<String,String>map = new HashMap<String,String>();

        map.put("许仙", "白娘子");
        map.put("牛郎", "织女");
        map.put("梁山伯", "祝英台");
        map.put("小香猪", "水白菜");

        //获取所有键
        Set<String>keyset=map.keySet();
        //获取每一个键
        for(String key:keyset){
            //通过键获取值
            String value=map.get(key);
            System.out.println(key+"="+map.get(key));
        }
        System.out.println("-----------------" );
        //map 集合存储的是键值对映射 map.Enrty<k,v>
        Set<Map.Entry<String,String>>entries = map.entrySet();
        //获取每一个键位
        for(Map.Entry<String,String>entry:entries){
            //通过键值对，获取值，获取键
            String value=entry.getValue();
            String key=entry.getKey();
            System.out.println(key+"="+value);
        }
        System.out.println("--------------------------------" );
        //通过map集合的forEach方法遍历
        map.forEach((k,v)-> System.out.println(k+"="+v));
    }
}
