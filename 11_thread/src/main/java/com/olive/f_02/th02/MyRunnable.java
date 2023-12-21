package com.olive.f_02.th02;

/**
 * @description: MyRunnable
 * @date: 2023/12/16 15:31
 * @author: olive
 * @version: 1.0
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : i = " + i);
        }
    }
}
