package com;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Demo11 {
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                2,
                5,
                10,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<> ( 5 ),
                new ThreadPoolExecutor.CallerRunsPolicy());
        for (int i = 0; i <10 ; i++) {
            pool.submit ( ()-> Thread.currentThread ( ).getName ()+"线程任务执行"+new Random ().nextInt(100));
        }
    }



}
