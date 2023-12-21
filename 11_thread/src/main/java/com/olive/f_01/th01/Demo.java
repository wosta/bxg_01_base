package com.olive.f_01.th01;

/**
 * @description: Demo
 * @date: 2023/6/19 21:26
 * @author: olive
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        MyThread m2 = new MyThread();
        MyThread m3 = new MyThread();

        Thread t1 = new Thread(m1);
        t1.setName("窗口一");
        Thread t2 = new Thread(m2);
        t2.setName("窗口二");
        Thread t3 = new Thread(m3);
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}
