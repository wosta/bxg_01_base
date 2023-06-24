package com.olive.th14;

import java.util.concurrent.BlockingQueue;

/**
 * @description: Foodie
 * @date: 2023/6/23 11:37
 * @author: olive
 * @version: 1.0
 */
public class Foodie implements Runnable {
    private final BlockingQueue queue;

    public Foodie(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(this.queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
