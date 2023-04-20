package Thread6;

public class Test {
    public static String table = "";

    public static void main(String[] args) {

        //创建两条现场启动，为了保证同一把锁 把锁对象传给两条线程

        Object lock = new Object();

        Thread thread = new Thread ( new ConsumerThread ( lock ) );
        Thread thread1 = new Thread ( new ProducerThread ( lock ) );
        thread.start();
        thread1.start();
    }
}