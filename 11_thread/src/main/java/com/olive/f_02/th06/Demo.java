package com.olive.f_02.th06;

/**
 * @description: Demo
 * @date: 2023/12/20 10:34
 * @author: olive
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread t1 = new Thread(ticket);
        Thread t2 = new Thread(ticket);
        Thread t3 = new Thread(ticket);
        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");
        t1.start();
        t2.start();
        t3.start();
        
    }
}
