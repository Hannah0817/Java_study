package com.hainiu;

import java.util.LinkedList;

public class test4 {
        LinkedList<String> list = new LinkedList<>();
        public static void main(String[] args) {
            Democratic.ShuiHu sh = new Democratic.ShuiHu ();
            sh.listadd();
            new Thread(sh,"线程A").start();
            new Thread(sh,"线程B").start();
            new Thread(sh,"线程C").start();
        }
    }

