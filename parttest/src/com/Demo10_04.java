package com;

public class Demo10_04 {
    public static class TicketWindow implements Runnable {

        private  static int tickets = 100;
        @Override
        public void run() {
            while (true){
                synchronized(this){
                    if (tickets<=0){
                        break;
                    }
                    try {
                        Thread.sleep (10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " ：正在出"+tickets-- +"张票");
                    if (tickets<=0){
                        break;
                    }
                }
            }
        }
    }
}
