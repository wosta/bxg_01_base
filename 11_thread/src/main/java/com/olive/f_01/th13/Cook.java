package com.olive.f_01.th13;

/**
 * @description: Cook
 * @date: 2023/6/23 10:52
 * @author: olive
 * @version: 1.0
 */
public class Cook implements Runnable {
    private final Desk desk;

    Cook(Desk desk) {
        this.desk = desk;
    }


    @Override
    public void run() {
        while (true) {
            synchronized (this.desk.lock) {
                if (this.desk.nums > 0) {
                    if (this.desk.flag == 0) {
                        this.desk.flag = 1;
                        this.desk.nums--;
                        System.out.println(Thread.currentThread().getName() + "开始cook");
                        this.desk.lock.notifyAll();
                    } else {
//                        this.desk.flag = 0;
                        try {
                            this.desk.lock.wait();
                        } catch (InterruptedException e) {
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
