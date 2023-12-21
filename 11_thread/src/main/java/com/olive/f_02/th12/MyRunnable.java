package com.olive.f_02.th12;

/**
 * @description: MyRunnable
 * @date: 2023/12/20 16:29
 * @author: olive
 * @version: 1.0
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
