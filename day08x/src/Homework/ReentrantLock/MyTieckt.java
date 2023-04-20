package Homework.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

//模拟多个窗口卖出同一个场次的票
public class MyTieckt implements Runnable{
    int ticket = 100;
    //可重互斥锁（空参构造 默认创建非公平锁）
    ReentrantLock lock = new ReentrantLock (true);
    @Override
    public void run() {
    //不停的售卖
        while (true){
            //获取锁
            lock.lock ();
            //判断票是否卖没
            if (ticket<=0){
                break;
            }
            //模拟售票程序执行的时间
            try {
                Thread.sleep (10);
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
            System.out.println (Thread.currentThread ().getName ()+"正在出售第"+ticket+"张票" );
            lock.unlock ();
        }
    }
}
