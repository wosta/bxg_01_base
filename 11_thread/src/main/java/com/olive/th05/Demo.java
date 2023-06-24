package com.olive.th05;/**
 * @description: Demo 
 * @date: 2023/6/20 21:18 
 * @author: olive 
 * @version: 1.0 
 */
public class Demo {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        t1.setName("坦克");
        t2.setName("飞机");
        t1.setPriority(10);
        t2.setPriority(1);
        t1.start();
        t2.start();
    }
}
