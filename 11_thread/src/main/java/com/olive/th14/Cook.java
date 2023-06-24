package com.olive.th14;

import java.util.concurrent.BlockingQueue;

/**
 * @description: Cook
 * @date: 2023/6/23 11:35
 * @author: olive
 * @version: 1.0
 */
public class Cook implements Runnable {
    private final BlockingQueue queue;

    public Cook(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                this.queue.put("汉堡包");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
