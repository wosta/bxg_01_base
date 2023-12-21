package com.olive.f_02.test;

/**
 * @description: Test03
 * @date: 2023/12/20 14:22
 * @author: olive
 * @version: 1.0
 */
public class Test03 extends Thread {

    // 同时开启两个线程，共同获取1-100之间的所有数字。
    // 将输出所有的奇数。
    static int num = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (Test03.class) {
                if (num > 0) {
                    if (num % 2 == 1) {
                        System.out.println(Thread.currentThread().getName() + " : " + num);
                    }
                    num--;
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Test03 t1 = new Test03();
        Test03 t2 = new Test03();
        t1.setName("计算器一");
        t2.setName("计算器二");
        t1.start();
        t2.start();
    }
}
