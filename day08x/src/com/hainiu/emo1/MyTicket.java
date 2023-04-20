package com.hainiu.emo1;

public class MyTicket {
    public static class TicketWindow implements Runnable {
        private static int ticket = 100;

        @Override
        public void run() {
            // 不停的售卖
            while (true) {
                // 判断票是否卖光
            /*
            问题1 出现0号票。
             */
                if (ticket <= 0) {
                    break;
                }
                // 模拟售票程序执行的时间
                try {
                    Thread.sleep ( 10 );
                } catch (InterruptedException e) {
                    e.printStackTrace ( );
                }
            /*
            问题2 出现重复的票号
                ticket-- 不是原子操作造成的
                原子性是指一个或者多个操作在C P U执行的过程中不被中断的特性，要么执行，要么不执行，不能执行到一半。
                1、获取ticket的值 并拷贝一个副本，参与打印操作的就是这个副本的值
                2、对ticket的值进行减一
             */
                System.out.println ( Thread.currentThread ( ).getName ( ) + "正在售出第 " + ticket-- + "张票" );
            }
        }
    }
}