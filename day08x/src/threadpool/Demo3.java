package threadpool;
//可缓存线程池
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo3 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool ();
        for (int i = 0; i < 10; i++) {
            executorService.submit ( ()->{
                System.out.println(Thread.currentThread().getName()+"线程执行"+new Random().nextInt ( 1000 ) );
            } );
        }
    }
}
