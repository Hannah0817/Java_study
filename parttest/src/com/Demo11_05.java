package com;

import java.lang.reflect.Array;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Demo11_05 {
    public static void main(String[] args) {

        //创建线程池
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor (
                10,
                100,
                10,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<> ( 100 ),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy ( )
        );
    }
}
