package Homework.consumer;

public class Test {
    public static String table = "";

    public static void main(String[] args) {

        //创建两条现场启动，为了保证同一把锁 把锁对象传给两条线程
        //测试类中传递一个信号  字符串  有值就该消费  没有值就生产
        Object lock = new Object();
        new Thread(new ConsumerThread(lock), "Tom").start();
        new Thread(new ProducerThread(lock), "Jerry").start();
    }
}