package threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/*
public ThreadPoolExecutor
(int corePoolSize,						// 核心线程数量
 int maximumPoolSize,					// 最大线程数量
  long keepAliveTime,					// 空闲线程存活时间（值）
  TimeUnit unit,						// 空闲线程存活时间（单位）
  BlockingQueue<Runnable> workQueue,	// 阻塞队列
   ThreadFactory threadFactory,			// 新线程的创建工厂（产生方式）
    RejectedExecutionHandler handler)	// 拒绝策略


 */
public class Demo4 {
    public static void main(String[] args) {
        //自定义线程池
        ThreadPoolExecutor pool =new ThreadPoolExecutor (
                2,
                5,
                20,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<> (5),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy ()

        );
        for (int i = 0; i < 17; i++) {
            pool.submit(()->{
                System.out.println(Thread.currentThread().getName()
                +"执行");
            });
        }
    }
}
