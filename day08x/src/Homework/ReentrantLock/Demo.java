package Homework.ReentrantLock;

import Homework.synchrnized.MyTicket;

public class Demo {
    public static void main(String[] args) {
        // 开启多条线程
        MyTicket ticket = new MyTicket ();
// 保证多条线程操作同一个共享资源

        new Thread(ticket, "窗口一").start();
        new Thread(ticket, "窗口二").start();
    }
}
