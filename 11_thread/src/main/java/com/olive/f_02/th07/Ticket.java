package com.olive.f_02.th07;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description: Ticket
 * @date: 2023/12/20 11:05
 * @author: olive
 * @version: 1.0
 */
public class Ticket extends Thread {
    static int ticket = 100;
    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "卖出了第" + ticket + "张票");
                    ticket--;
                    Thread.sleep(10);
                } else {
                    System.out.println("票卖完了");
                    break;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    }
}
