package com;

import java.awt.*;

public class Demo10_01test {
    public static void main(String[] args) {
        Demo10_3.TicketWindow window = new Demo10_3.TicketWindow();
        new Thread ( window,"yi" ).start();
        new Thread ( window,"yi" ).start();
    }
}
