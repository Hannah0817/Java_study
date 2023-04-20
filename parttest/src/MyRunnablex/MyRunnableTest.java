package MyRunnablex;

public class MyRunnableTest {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable);
        thread1.start();

        Thread thread2 = new Thread(myRunnable);
        thread2.start();
    }
}
