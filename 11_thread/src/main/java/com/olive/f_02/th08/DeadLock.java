package com.olive.f_02.th08;

/**
 * @description: DeadLock
 * @date: 2023/12/20 11:19
 * @author: olive
 * @version: 1.0
 */
public class DeadLock extends Thread {
    static Object lockA = new Object();
    static Object lockB = new Object();

    @Override
    public void run() {
        while (true) {
            if ("锁A".equals(Thread.currentThread().getName())) {
                synchronized (lockA) {
                    System.out.println("锁A拿到锁了，锁A被我锁住了");
                    synchronized (lockB) {
                        System.out.println("锁A中锁B被我锁住了");
                    }
                }
            } else if ("锁B".equals(Thread.currentThread().getName())) {
                synchronized (lockB) {
                    System.out.println("锁B拿到锁了，锁B被我锁住了");
                    synchronized (lockA) {
                        System.out.println("锁B中锁A被我锁住了");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        DeadLock dl1 = new DeadLock();
        DeadLock dl2 = new DeadLock();
        dl1.setName("锁A");
        dl2.setName("锁B");
        dl1.start();
        dl2.start();
    }
}
