package com.olive.f_02.th04;

/**
 * @description: Ticket
 * @date: 2023/12/18 9:14
 * @author: olive
 * @version: 1.0
 */
public class Ticket implements Runnable {
    // 某电影院目前正在上映国产大片，共有100张票，而它有3个窗口卖票，请设计一个程序模拟该电影院卖票
    private static Integer t_num = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (t_num > 0) {
                    t_num--;
                    System.out.println(Thread.currentThread().getName() + " ： 正在卖票，还剩 " + t_num + "张票.");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    break;
                }
            }
        }
    }
}