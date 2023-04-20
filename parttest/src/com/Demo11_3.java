package com;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Demo11_3 {
    public static void main(String[] args) {
        //创建线程池

        ThreadPoolExecutor pool = new ThreadPoolExecutor (
                2,
                5,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<> ( 10 ),
                Executors.defaultThreadFactory ( ),
                new ThreadPoolExecutor.AbortPolicy ( )
        );
    }
}
