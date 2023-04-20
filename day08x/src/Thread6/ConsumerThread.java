package Thread6;
//消费者线程
public class ConsumerThread implements Runnable {
    private Object lock;

    public ConsumerThread(Object lock) {
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
                //有 开吃
                    System.out.println("消费者消费了" + Test.table);
                    Test.table = " ";
                    lock.notifyAll ();
                }
            }
        }
    }

