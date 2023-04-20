package com.hainiu;
import java.util.ArrayList;
import java.util.Iterator;
//1、定义ArrayList集合，随意存储几个字符串，并遍历（三种：迭代器 foreach 索引）
public class homework1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        /*//迭代器
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/

        /*//foreach
        for (String s : list){
            System.out.println(s);
            }
            */

            for (int i = 0; i < list.size(); i++){
                System.out.println(list.get(i));
            }
        }
    }

