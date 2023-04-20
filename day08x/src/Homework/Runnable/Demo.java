package Homework.Runnable;

public class  Demo {
    public static void main(String[] args) {
        //创建线程对象，在构造方法传递的参数，启动线程时会调用对象发run方法
        MyRunnable myRunnable = new MyRunnable();
        //创建线程对象
        Thread thread1 = new Thread ( myRunnable );
        //开启线程
        thread1.start ();

        //再创建一条线程
        Thread thread2 = new Thread ( myRunnable );
        thread2.start ();
    }
}
