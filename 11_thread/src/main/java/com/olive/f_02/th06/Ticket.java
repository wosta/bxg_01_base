package com.olive.f_02.th06;

/**
 * @description: Ticket
 * @date: 2023/12/20 10:32
 * @author: olive
 * @version: 1.0
 */
public class Ticket implements Runnable {
    int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (this.method()) {
                break;
            }
        }
    }

    private synchronized boolean method() {
        if (this.ticket > 0) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.ticket--;
            System.out.println(Thread.currentThread().getName() + "卖票，票还有：" + this.ticket);
        } else {
            return true;
        }
        return false;
    }
}
