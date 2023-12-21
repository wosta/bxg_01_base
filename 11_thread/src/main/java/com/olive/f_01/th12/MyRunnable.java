package com.olive.f_01.th12;

/**
 * @description: MyRunnable
 * @date: 2023/6/23 10:33
 * @author: olive
 * @version: 1.0
 */
public class MyRunnable implements Runnable {
    private static final Object objectA = new Object();
    private static final Object objectB = new Object();

    @Override
    public void run() {
        while (true) {
            if ("线程一".equals(Thread.currentThread().getName())) {
                synchronized (objectA) {
                    System.out.println(Thread.currentThread().getName());
                    synchronized (objectB) {
                        System.out.println(Thread.currentThread().getName());
                    }
                }
            }
            if ("线程二".equals(Thread.currentThread().getName())) {
                synchronized (objectB) {
                    System.out.println(Thread.currentThread().getName());
                    synchronized (objectA) {
                        System.out.println(Thread.currentThread().getName());
                    }
                }
            }
        }
    }
}
