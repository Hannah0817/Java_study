package com;

import java.util.concurrent.*;

public class Dmeo11_04 {
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                10,
                10,
                10,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<> ( 10 ),
               // Executor.defaultExecutor.
                new ThreadPoolExecutor.AbortPolicy()
        );
    }
}
