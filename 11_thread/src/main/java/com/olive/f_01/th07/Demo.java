package com.olive.f_01.th07;

/**
 * @description: Demo
 * @date: 2023/6/20 22:11
 * @author: olive
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        MyThread m2 = new MyThread();
        m1.setName("坦克");
        m2.setName("大炮");
        m1.start();
        m2.start();
    }
}
