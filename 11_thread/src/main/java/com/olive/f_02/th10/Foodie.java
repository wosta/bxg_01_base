package com.olive.f_02.th10;

import com.olive.f_02.th09.Desk;

import java.util.concurrent.BlockingQueue;

/**
 * @description: Foodie
 * @date: 2023/12/20 13:40
 * @author: olive
 * @version: 1.0
 */
public class Foodie extends Thread {
    BlockingQueue<String> queue;

    int count;

    public Foodie(BlockingQueue<String> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    @Override
    public void run() {
        while (true) {
            try {
                if (Desk.count > 0) {
                    String food = this.queue.take();
                    System.out.println("吃货在吃:" + food);
                } else {
                    break;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
