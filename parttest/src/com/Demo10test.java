package com;

public class Demo10test {
    public static void main(String[] args) {

        Demo10_1.TicketWindow window = new Demo10_1.TicketWindow ();
        // 开启两条线程
        new Thread(window, "窗口一").start();
        new Thread(window, "窗口二").start();

    }
}
