package com.olive.f_02.th09;

/**
 * @description: Foodie
 * @date: 2023/12/20 11:33
 * @author: olive
 * @version: 1.0
 */
public class Foodie extends Thread {

    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    if (Desk.foodFlag == 1) {
                        Desk.count--;
                        System.out.println(Thread.currentThread().getName() + " 吃到了");
                        Desk.foodFlag = 0;
                        try {
                            Desk.lock.notifyAll();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        try {
                            Desk.lock.wait();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
