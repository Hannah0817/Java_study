package MyRunnablex;

public class MyRunnableTest01 {
    public static void main(String[] args) {
        MyRunnable01 myRunnable01 = new MyRunnable01();
        Thread thread1 = new Thread(myRunnable01);
        thread1.start();
        Thread thread2 = new Thread(myRunnable01);
        thread2.start();
    }
}
