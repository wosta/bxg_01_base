package com.olive.f_02.th10;

import com.olive.f_02.th09.Desk;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @description: Demo
 * @date: 2023/12/20 13:41
 * @author: olive
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);
        Cook cook = new Cook(queue, Desk.count);
        Foodie food = new Foodie(queue, Desk.count);
        cook.start();
        food.start();
    }
}
