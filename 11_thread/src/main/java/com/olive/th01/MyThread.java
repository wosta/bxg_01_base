package com.olive.th01;

import java.util.Objects;

/**
 * @description: MyThread
 * @date: 2023/6/19 21:26
 * @author: olive
 * @version: 1.0
 */
public class MyThread implements Runnable {


    private static Object obj = new Object();
    private static int tickets = 100;

    @Override
    public void run() {
        while(true) {
            synchronized(obj) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    tickets--;
                    System.out.println(Thread.currentThread().getName() + "正在卖票，还剩"+tickets+"张票");
                }else {
                    break;
                }
            }
        }
    }
}
