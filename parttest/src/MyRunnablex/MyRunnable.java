package MyRunnablex;

import java.util.concurrent.ThreadPoolExecutor;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println ( Thread.currentThread ().getName () +" ：正在输出第" + i+"个数");
        }
    }

}
