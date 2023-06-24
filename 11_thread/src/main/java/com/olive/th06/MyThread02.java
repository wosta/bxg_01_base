package com.olive.th06;

/**
 * @description: MyThread02
 * @date: 2023/6/20 22:02
 * @author: olive
 * @version: 1.0
 */
public class MyThread02 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() +"@" +i);
        }
    }
}
