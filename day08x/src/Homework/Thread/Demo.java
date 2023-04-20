package Homework.Thread;
//Thread
public class Demo {

    public static void main(String[] args) {

    /*new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("线程执行");
        }
    }).start();*/

    /*new Thread(() -> {
        System.out.println("线程执行");
    }).start();*/

        // 两把锁
        Object lockA = new Object();
        Object lockB = new Object();

        // 开启一条线程
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                // 先使用lockA加锁
                synchronized (lockA) {
                    System.out.println(Thread.currentThread().getName() + "获取到lockA, 继续执行");
                    synchronized (lockB) {
                        System.out.println(Thread.currentThread().getName() + "获取到lockB, 继续执行");
                    }
                }
            }
        }).start();

        // 再开启一条线程
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                // 先使用lockB加锁
                synchronized (lockB) {
                    System.out.println(Thread.currentThread().getName() + "获取到lockA, 继续执行");
                    synchronized (lockA) {
                        System.out.println(Thread.currentThread().getName() + "获取到lockB, 继续执行");
                    }
                }
            }
        }).start();

    }
}