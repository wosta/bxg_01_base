package com.olive.th09;

import java.util.Objects;

/**
 * @description: MyRunnable
 * @date: 2023/6/23 10:07
 * @author: olive
 * @version: 1.0
 */
public class MyRunnable implements Runnable {
    private static int tickets = 100;
    private static final Object lock = new Object();
    @Override
    public void run() {
        while (true) {
            synchronized (MyRunnable.class) {
                if (tickets <= 0) {
                    break;
                }
                try {
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName() + "正在卖票，还剩: " + tickets-- + "张票。");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
