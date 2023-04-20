package Thread1;

import java.util.concurrent.ArrayBlockingQueue;

//开启线程
public class BlockQueueTest {
    //定义一个可以消费的产品--有没有产品的标识

    public static void main(String[] args) throws InterruptedException {
        // 阻塞队列创建时必须指定容量
        ArrayBlockingQueue<Object> queue = new ArrayBlockingQueue<>(1);
        new Thread(new Consumer(queue)).start();
        new Thread(new Producer(queue)).start();
    }
}