package Thread1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Lock;

// 消费线程
public class Consumer implements Runnable {

    private ArrayBlockingQueue<Object> queue;

    public Consumer(ArrayBlockingQueue<Object> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        // 一直取
        while (true) {
            Object data = null;
            try {
                data = queue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("消费一个产品【" + data + "】，目前队列中剩余产品：" + queue.size());
        }
    }
}