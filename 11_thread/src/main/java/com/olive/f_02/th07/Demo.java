package com.olive.f_02.th07;

/**
 * @description: Demo
 * @date: 2023/12/20 11:09
 * @author: olive
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        Ticket t1 = new Ticket();
        Ticket t2 = new Ticket();
        Ticket t3 = new Ticket();
        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");
        t1.start();
        t2.start();
        t3.start();
    }
}
