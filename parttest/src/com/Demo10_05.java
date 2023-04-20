package com;

public class Demo10_05 {
    public static class TicketWindow implements Runnable {
   private static int ticket = 100;
        @Override
        public void run() {
            while (true){
                synchronized (this) {
                    if (ticket <=0){
                        break;
                    }
                    try {
                        Thread.sleep (10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":正在出 " + ticket-- + "张票");
                    if (ticket<=0){
                        break;
                    }
                }
            }
        }
    }
}
