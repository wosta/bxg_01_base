package com.olive.f_02.th12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @description: MyThreadPool02
 * @date: 2023/12/20 16:35
 * @author: olive
 * @version: 1.0
 */
public class MyThreadPool02 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        MyRunnable m1 = new MyRunnable();
        MyRunnable m2 = new MyRunnable();
        MyRunnable m3 = new MyRunnable();
        MyRunnable m4 = new MyRunnable();
        MyRunnable m5 = new MyRunnable();
//        executorService.submit(m1);
//        executorService.submit(m2);
//        executorService.submit(m3);
//        executorService.submit(m4);
//        executorService.submit(m5);

    }
}
