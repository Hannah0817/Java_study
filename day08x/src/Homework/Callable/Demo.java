package Homework.Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable myCallable = new MyCallable();
        //FutureTask可用于包装callabl或runable对象，FutureTask实现了runacble。
        //FutureTask的get（）方法可以获取call（）执行完毕得到结果
        FutureTask task1 = new FutureTask(myCallable);
        //创建线程对象时，将FutureTask对象传递到构造方法
        Thread thread1 = new Thread(task1);
        //启动
        thread1.start();

        //再开启一条线
        FutureTask task2 = new FutureTask(myCallable);
        Thread thread2 = new Thread(task2);
        thread2.start();

        ///获取结果，如果线程没有执行完毕，get（）方法会阻塞
        Object obj1 = task1.get ();
        Object obj2 = task2.get ();
        System.out.println (obj1 );
        System.out.println (obj2 );

    }
}
