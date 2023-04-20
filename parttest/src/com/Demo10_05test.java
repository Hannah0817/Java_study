package com;

public class Demo10_05test {
    public static void main(String[] args) {
        Demo10_05.TicketWindow window = new Demo10_05.TicketWindow();
        Runnable r = window;
        Thread a = new Thread ( "xiai" );
        a.start ( );
       /* new Thread(window,"窗口一").start();
        new Thread(window,"窗口二").start();*/
    }
}
