package com.olive.f_02.th02;

/**
 * @description: Demo
 * @date: 2023/12/16 15:32
 * @author: olive
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr);
        t1.setName("线程1");
        Thread t2 = new Thread(mr);
        t2.setName("线程2");
        t1.start();
        t2.start();
    }
}
