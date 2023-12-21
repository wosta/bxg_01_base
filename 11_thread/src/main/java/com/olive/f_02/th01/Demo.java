package com.olive.f_02.th01;

/**
 * @description: Demo
 * @date: 2023/12/16 14:54
 * @author: olive
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.setName("线程1");
        t.start();

        MyThread t2 = new MyThread();
        t2.setName("线城2");
        t2.start();
    }
}
