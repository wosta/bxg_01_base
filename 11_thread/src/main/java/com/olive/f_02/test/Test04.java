package com.olive.f_02.test;

import cn.hutool.core.util.RandomUtil;

/**
 * @description: Test04
 * @date: 2023/12/20 14:31
 * @author: olive
 * @version: 1.0
 */
public class Test04 extends Thread {
    /*
     抢红包也用到了多线程。
	假设：100块，分成了3个包，现在有5个人去抢。
	其中，红包是共享数据。
	5个人是5条线程。
	打印结果如下：
		  XXX抢到了XXX元
		  XXX抢到了XXX元
		 XXX抢到了XXX元
		 XXX没抢到
		XXX没抢到
*/
    static int redPackage = 100;
    static int count = 5;

    @Override
    public void run() {
        synchronized (Test04.class) {
            if (count > 3) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                int r = RandomUtil.randomInt(redPackage);
                System.out.println(Thread.currentThread().getName() + "抢到了" + r + "元");
                redPackage -= r;
                count--;
            } else if (count > 2) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + "抢到了" + redPackage + "元");
                count--;
            } else {
                System.out.println(Thread.currentThread().getName() + "没抢到");
            }
        }
    }

    public static void main(String[] args) {
        Test04 t1 = new Test04();
        Test04 t2 = new Test04();
        Test04 t3 = new Test04();
        Test04 t4 = new Test04();
        Test04 t5 = new Test04();

        t1.setName("小红");
        t2.setName("小亚");
        t3.setName("小晶");
        t4.setName("小婷");
        t5.setName("小瑞");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
