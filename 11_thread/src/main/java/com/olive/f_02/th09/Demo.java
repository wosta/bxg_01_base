package com.olive.f_02.th09;

/**
 * @description: Demo
 * @date: 2023/12/20 11:33
 * @author: olive
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        Cook cook = new Cook();
        cook.setName("大人");
        Foodie foodie = new Foodie();
        foodie.setName("小孩");
        cook.start();
        foodie.start();
    }
}
