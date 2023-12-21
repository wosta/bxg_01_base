package com.olive.f_01.th14;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @description: Demo
 * @date: 2023/6/23 11:35
 * @author: olive
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        BlockingQueue queue = new ArrayBlockingQueue(1);
        Cook cook = new Cook(queue);
        Foodie food = new Foodie(queue);
        Thread t1 = new Thread(cook);
        Thread t2 = new Thread(food);
        t1.setName("厨师");
        t2.setName("美食家");
        t1.start();
        t2.start();
    }
}
