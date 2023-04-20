package com;

public class Demo10_04test {
    public static void main(String[] args) {
        Demo10_04.TicketWindow window = new Demo10_04.TicketWindow();
        new Thread(window ,"窗口一").start ();
        new Thread(window ,"窗口二").start ();

    }
}
