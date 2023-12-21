package com.olive.f_02.th04;

/**
 * @description: Demo
 * @date: 2023/12/18 9:17
 * @author: olive
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        Thread t1 = new Thread(t);
        t1.setName("窗口一");
        Thread t2 = new Thread(t);
        t2.setName("窗口二");
        Thread t3 = new Thread(t);
        t3.setName("窗口三");
        t1.start();
        t2.start();
        t3.start();
    }
}
