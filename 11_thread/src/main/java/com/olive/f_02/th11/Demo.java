package com.olive.f_02.th11;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @description: Demo
 * @date: 2023/12/20 13:57
 * @author: olive
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(1);
        Classroom classroom = new Classroom(queue);
        Student student = new Student(queue);
        classroom.start();
        student.start();

    }
}
