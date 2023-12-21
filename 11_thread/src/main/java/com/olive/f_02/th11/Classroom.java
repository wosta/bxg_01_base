package com.olive.f_02.th11;

import java.util.concurrent.BlockingQueue;

/**
 * @description: Classroom
 * @date: 2023/12/20 13:55
 * @author: olive
 * @version: 1.0
 */
public class Classroom extends Thread {
    BlockingQueue<String> queue;

    public Classroom(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String take = this.queue.take();
                System.out.println(take + ":进场了");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
