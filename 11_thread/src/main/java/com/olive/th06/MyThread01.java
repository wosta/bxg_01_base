package com.olive.th06;

/**
 * @description: MyThread01
 * @date: 2023/6/20 22:00
 * @author: olive
 * @version: 1.0
 */
public class MyThread01 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "@" + i);
        }
    }
}
