package com.olive.th09;

/**
 * @description: Demo
 * @date: 2023/6/23 10:06
 * @author: olive
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        Thread t3 = new Thread(mr);

        t1.setName("窗口一");
        t3.setName("窗口三");
        t2.setName("窗口二");

        t1.start();
        t2.start();
        t3.start();
    }
}
