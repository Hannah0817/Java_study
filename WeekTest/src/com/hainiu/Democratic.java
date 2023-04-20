package com.hainiu;

import java.util.LinkedList;

public class Democratic {
    /*需要考虑如何在run方法中使用list，在方法体外无法给list赋值，所以写了一个方法，又由于三个线程，所以在main方法中用
     ShuiHu的对象执行一次赋值方法即可
     */
    public static class ShuiHu implements Runnable{
    LinkedList<String> list = new LinkedList<>();
    @Override
    public void run() {
        while(true) {
            synchronized (this){
                if(list.size() == 0 ){
                    break;
                }
                //休眠0.1秒
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"获得英雄:"+list.getFirst());
                list.removeFirst();
            }
        }
    }
    public void listadd(){
        list.add("及时雨宋江");
        list.add("玉麒麟卢俊义");
        list.add("智多星吴用");
        list.add("入云龙公孙胜");
        list.add("大刀关胜");
        list.add("豹子头林冲");
        list.add("霹雳火秦明");
        list.add("双鞭呼延灼");
        list.add("小李广花荣");
        list.add("小旋风柴进");
        list.add("扑天雕李应");
        list.add("美髯公朱仝");
        list.add("花和尚鲁智深");
        list.add("行者武松");
    }
}

    }
