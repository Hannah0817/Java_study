package com.hainiu.emo1;

public class TicketWindow {
        public static void main(String[] args) {

            TicketWindow window = new TicketWindow();
            // 开启两条线程
            new Thread( (Runnable) window, "窗口一").start();
            new Thread( (Runnable) window, "窗口二").start();

        }
    }

