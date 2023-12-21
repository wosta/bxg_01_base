package com.olive.f_02.th12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @description: MyThreadPool
 * @date: 2023/12/20 16:28
 * @author: olive
 * @version: 1.0
 */
public class MyThreadPool {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        MyRunnable m1 = new MyRunnable();
        MyRunnable m2 = new MyRunnable();
        MyRunnable m3 = new MyRunnable();
        Thread.sleep(100);
        executorService.submit(m1);
        Thread.sleep(100);
        executorService.submit(m2);
        Thread.sleep(100);
        executorService.submit(m3);

    }
}
