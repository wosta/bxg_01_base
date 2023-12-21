package com.olive.f_02.th03;

import java.util.concurrent.FutureTask;

/**
 * @description: Demo
 * @date: 2023/12/16 15:38
 * @author: olive
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        MyCallable mc = new MyCallable();
        FutureTask<String> ft = new FutureTask<>(mc);
        Thread t = new Thread(ft);
        t.setName("线程1");
        t.start();


        FutureTask<String> ft2 = new FutureTask<>(mc);
        Thread t2 = new Thread(ft2);
        t2.setName("线程2");
        t2.start();
    }
}
