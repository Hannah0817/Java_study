package Thread6;

public class ProducerThread  implements Runnable{
 private Object lock;

    public ProducerThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        //不断的吃
        while (true) {

            synchronized (lock) {
                if(" ".equals(Test.table)){
                    //没有，我等待
                    try{
                        lock.wait();
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //有 生产
                System.out.println("消费者消费了" + Test.table);
                Test.table = " 汉堡包";

                //唤醒消毒线程
                lock.notifyAll ();
            }
        }
    }
}

