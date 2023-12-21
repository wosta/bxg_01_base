package com.olive.f_01.thpool02;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @description: Demo
 * @date: 2023/6/24 11:03
 * @author: olive
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(3, 6,
                3000, TimeUnit.MICROSECONDS,
                new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
//        poolExecutor
        int count = Runtime.getRuntime().availableProcessors();
        System.out.println(count + " processors");
    }
}