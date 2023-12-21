package com.olive.f_02.th01;

/**
 * @description: MyThread
 * @date: 2023/12/16 14:53
 * @author: olive
 * @version: 1.0
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

