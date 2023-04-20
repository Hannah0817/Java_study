package com;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Demo11_1 {
    public static void main(String[] args) {
        //标准线程池的创建
        //创建线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                2,//// 核心线程数量
                5,//// 最大线程数量
                60,// 空闲线程存活时间（值）
                TimeUnit.SECONDS,// 空闲线程存活时间（单位）
                new ArrayBlockingQueue<Runnable> (10),// 阻塞队列
                Executors.defaultThreadFactory (),// 新线程的创建工厂（产生方式）
                new ThreadPoolExecutor.AbortPolicy () );	// 拒绝策略
        for (int i = 0; i < 10; i++) {
            pool.submit(()->  System.out.println ( Thread.currentThread ( ).getName ( )+ "线程任务执行" + new Random ().nextInt(100 )));
        }
    }
}
