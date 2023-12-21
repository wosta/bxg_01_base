package com.olive.f_01.thpool01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @description: Demo
 * @date: 2023/6/23 12:08
 * @author: olive
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(new MyRunnable());
        executorService.submit(new MyRunnable());
        executorService.submit(new MyRunnable());
        executorService.submit(new MyRunnable());

        executorService.shutdown();
    }


}
