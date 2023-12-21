package com.olive.f_01.th13;

/**
 * @description: Foodie
 * @date: 2023/6/23 10:52
 * @author: olive
 * @version: 1.0
 */
public class Foodie implements Runnable {
    private final Desk desk;

    Foodie(Desk desk) {
        this.desk = desk;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (this.desk.lock) {
                if (this.desk.nums > 0) {
                    if (this.desk.flag == 1) {
                        System.out.println("美食家正在吃" + this.desk.nums);
                        this.desk.flag = 0;
                        this.desk.lock.notifyAll();
                    } else {
                        try {
                            this.desk.lock.wait();
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    }
                } else {
                    break;
                }
            }
        }
    }
}
