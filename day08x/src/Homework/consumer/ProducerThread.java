package Homework.consumer;

public class ProducerThread  implements Runnable{
 private Object lock;

    public ProducerThread(Object lock) {
        this.lock = lock;
    }
    @Override
    public void run() {
        //不断的生产
        while (true) {
            synchronized (lock) {
                //判断有没有汉堡
                if(!"".equals( Test.table)){
                    //有，等待
                    try{
                        lock.wait();
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //没有 生产
                Test.table = "汉堡包";
                System.out.println(Thread.currentThread ().getName ()+"生产了一个" + Test.table);

                //唤醒消毒线程
                lock.notifyAll ();
            }
        }
    }
}

