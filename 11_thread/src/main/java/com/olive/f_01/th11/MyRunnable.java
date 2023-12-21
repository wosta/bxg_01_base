package com.olive.f_01.th11;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @description: MyRunnable
 * @date: 2023/6/23 10:26
 * @author: olive
 * @version: 1.0
 */
public class MyRunnable implements Runnable {
    private static int tickets = 100;
    private static ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                if (tickets > 0) {
                    System.out.println(Thread.currentThread().getName() + ": " + tickets--);
                }
            } finally {
                lock.unlock();
            }
        }
    }
}
