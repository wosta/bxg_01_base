package com.olive.f_01.th08;

/**
 * @description: Demo
 * @date: 2023/6/20 22:16
 * @author: olive
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) throws InterruptedException {
        MyThread m1 = new MyThread();
        m1.setName("飞机");
        m1.start();
        //表示把t这个线程，插入到当前线程之前。 如果没有join的话，是优先执行main方法。
        //t:飞机
        //当前线程: main线程
        m1.join();
        //执行在main线程当中的
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程" + i);
        }
    }
}
