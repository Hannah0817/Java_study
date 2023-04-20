package com;

import java.util.concurrent.*;

public class Demo11_2 {
    public static void main(String[] args) {
        //创建线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor (
                2,
                5,
                0L,
                TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<Runnable>(10),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy ()

        );

        }

}
