package com.olive.f_02.test;

import cn.hutool.core.util.RandomUtil;

import java.util.Arrays;
import java.util.List;

/**
 * @description: Test05
 * @date: 2023/12/20 14:45
 * @author: olive
 * @version: 1.0
 */
public class Test05 extends Thread {
    /* 有一个抽奖池,该抽奖池中存放了奖励的金额,该抽奖池中的奖项为 {10,5,20,50,100,200,500,800,2,80,300,700};
            创建两个抽奖箱(线程)设置线程名称分别为“抽奖箱1”，“抽奖箱2”
            随机从抽奖池中获取奖项元素并打印在控制台上,格式如下:
            每次抽出一个奖项就打印一个(随机)
            抽奖箱1 又产生了一个 10 元大奖
            抽奖箱1 又产生了一个 100 元大奖
            抽奖箱1 又产生了一个 200 元大奖
            抽奖箱1 又产生了一个 800 元大奖
            抽奖箱2 又产生了一个 700 元大奖
*/
    public static Integer[] prize = {10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700};
    public static List<Integer> list = Arrays.asList(prize);
    public static int num = 10;

    @Override
    public void run() {
        while (true) {
            synchronized (Test03.class) {
                if (num > 0) {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    int i = RandomUtil.randomInt(list.size());
                    System.out.println(Thread.currentThread().getName() + " 又产生了一个 " + list.get(i) + " 元大奖");
                    list.remove(i);
                    num--;
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < prize.length; i++) {
            System.out.print(prize[i] + " ");
        }
        System.out.println("--------------------------------");
        Test05 t1 = new Test05();
        Test05 t2 = new Test05();
        t1.setName("抽奖箱1");
        t2.setName("抽奖箱2");
        t1.start();
        t2.start();
    }
}
