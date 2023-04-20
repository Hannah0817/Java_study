package Homework.Thread;
//继承Threa类是为了成为一个线程类
public class MyThread extends Thread {
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    // 2重写run方法 把要执行的任务 在run方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
        /*if (i == 10) {
            Thread.yield(); // 礼让线程
        }*/

            System.out.println(getName() + "  hello thread " + i);
        }

    }
}

