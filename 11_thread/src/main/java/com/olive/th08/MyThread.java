package com.olive.th08;

/**
 * @description: MyThread
 * @date: 2023/6/20 22:16
 * @author: olive
 * @version: 1.0
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + ": " + i);
        }
    }
}
