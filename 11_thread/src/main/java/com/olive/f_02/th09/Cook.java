package com.olive.f_02.th09;

/**
 * @description: Cook
 * @date: 2023/12/20 11:32
 * @author: olive
 * @version: 1.0
 */
public class Cook extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    if (Desk.foodFlag == 0) {
                        System.out.println("厨师:" + Thread.currentThread().getName() + "正在炒菜");
                        Desk.foodFlag = 1;
                        Desk.lock.notifyAll();
                    } else {
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
    }
}
