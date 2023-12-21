package com.olive.f_01.th13;

/**
 * @description: Demo
 * @date: 2023/6/23 10:52
 * @author: olive
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        Desk desk = new Desk();

        Foodie foodie = new Foodie(desk);
        Cook cook = new Cook(desk);
        Thread t1 = new Thread(foodie);
        Thread t2 = new Thread(cook);
        t1.setName("美食家");
        t2.setName("厨师");
        t1.start();
        t2.start();
    }
}
