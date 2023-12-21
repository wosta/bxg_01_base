package com.olive.f_02.th11;

import java.util.concurrent.BlockingQueue;

/**
 * @description: Student
 * @date: 2023/12/20 13:52
 * @author: olive
 * @version: 1.0
 */
public class Student extends Thread {
    public static int count = 0;
    BlockingQueue<String> queue;

    public Student(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            if (Student.count < 50) {
                try {
                    this.queue.put("学生" + ++Student.count);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
