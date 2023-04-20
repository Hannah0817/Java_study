package threadpool;
//固定数量的线程池
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class demo2 {
    public static void main(String[] args) {
//
        ExecutorService executorService = Executors.newFixedThreadPool ( 3);
        for (int i = 0; i < 3; i++) {
            executorService.submit ( ()->{
                System.out.println(Thread.currentThread().getName()+"线程执行");

            } );
                }

        }
    }

