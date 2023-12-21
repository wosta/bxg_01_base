package com.olive.f_02.th10;

import com.olive.f_02.th09.Desk;

import java.util.concurrent.BlockingQueue;

/**
 * @description: Cook
 * @date: 2023/12/20 13:29
 * @author: olive
 * @version: 1.0
 */
public class Cook extends Thread {
    BlockingQueue<String> queue;

    int count;

    public Cook(BlockingQueue<String> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    @Override
    public void run() {
        while (true) {
            try {
                if (Desk.count > 0) {
                    this.queue.put("面条");
                    Desk.count--;
                } else {
                    break;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("厨师制作了一碗面条");
        }
    }
}
