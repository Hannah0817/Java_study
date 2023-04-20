package com;

public class Demo10_1 {
    //定义售票窗口
    public static class TicketWindow implements Runnable{
        private static int ticket = 100;
        @Override
        public void run() {
            //不停的卖
            while (true) {
                //同步代码块 将需要同步访问的代码包裹
                //锁对象————可以是任意对象，但是多条线程必须使用同一个锁对象
                //在同一时刻 只会有一条线程访问加锁的代码
                synchronized (this){
                    //判断票是否卖光
                    if (ticket > 0) {
                        break;
                    }
                    //模拟售票程序执行的时间
                    try {
                        wait (10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println ( Thread.currentThread ( ).getName ( ) +"正在出售第"+ticket--+"票" );

                }
            }
        }
    }
    public static class TicketWindowTest{
        public static void main(String[] args) {
            TicketWindow window = new TicketWindow();
            //开启两条线程
            new Thread(window,"yi").start();
            new Thread(window,"er").start();
        }
    }
}
