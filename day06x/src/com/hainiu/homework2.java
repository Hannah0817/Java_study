package com.hainiu;

import java.util.ArrayList;
import java.util.LinkedList;

//2、LinkedList 1-108号 排序拿好，拿起一张扔掉，拿起一张放到最下面。反复操作，直到剩余一张，剩的谁？
public class homework2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i <108 ; i++) {
            list.add(i);
        }
        while (list.size()>1){
            list.removeFirst();
            list.addLast(list.removeFirst());
        }
        //幸存者
        Integer num = list.get(0);
        System.out.println(num);
    }
}
