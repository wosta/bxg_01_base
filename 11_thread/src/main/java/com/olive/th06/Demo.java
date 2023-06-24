package com.olive.th06;

/**
 * @description: Demo
 * @date: 2023/6/20 22:04
 * @author: olive
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        MyThread01 t1 = new MyThread01();
        MyThread02 t2 = new MyThread02();
        t1.setName("女神");
        t2.setName("备胎");
        t2.setDaemon(true);
        t1.start();
        t2.start();
    }
}
