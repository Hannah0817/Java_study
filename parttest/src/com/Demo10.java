package com;
/*
同步代码块(Synchronized Block)简单来说就是将一段代码用一把锁给锁起来，只有获得了这把锁的线程才访问，
 并且同一时刻，只有一个线程能持有这把锁，这样就保证了同一时刻只有一个线程能执行被锁住的代码。
由 synchronized 锁住的代码是拿{}括起来的代码块；
synchronized 也可以用来修饰一个方法，则对应的被锁保护的一段代码就是整个方法体。
 */
public class Demo10 {
    // 定义售票窗口
    public static class TicketWindow implements Runnable {

        private static int ticket = 100;

        @Override
        public void run() {
            // 不停的售卖
            while (true) {
                // 同步代码块 将需要同步访问的代码包裹
                // 锁对象 -- 可以是任意对象，但是多条线程必须使用同一个锁对象
                // 在同一时刻 只会有一条线程访问加锁的代码
                synchronized (this) {
                    // 判断票是否卖光
                    if (ticket <= 0) {
                        break;
                    }
                    // 模拟售票程序执行的时间
                    try {
                        wait ( 10 );
                    } catch (InterruptedException e) {
                        e.printStackTrace ( );
                    }
                    System.out.println ( Thread.currentThread ( ).getName ( ) + "正在售出第 " + ticket-- + "张票" );
                }
            }
        }
    }
}

