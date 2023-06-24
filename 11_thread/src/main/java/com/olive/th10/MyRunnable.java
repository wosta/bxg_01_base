package com.olive.th10;

/**
 * @description: MyRunnable
 * @date: 2023/6/23 10:13
 * @author: olive
 * @version: 1.0
 */
public class MyRunnable implements Runnable{
    private static int tickets = 100;

    @Override
    public void run() {
        while (true) {
            if (tickets <= 0) {
                break;
            }else {
                try {
                    method();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    private static synchronized void method() throws InterruptedException {
        Thread.sleep(100);
        System.out.println(Thread.currentThread().getName()+"在卖票，还剩"+tickets--+"张票");
    }
}
