package com.olive.f_01.th05;

/**
 * @description: MyRunnable
 * @date: 2023/6/20 21:18
 * @author: olive
 * @version: 1.0
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " @ " + i);
        }
    }
}
