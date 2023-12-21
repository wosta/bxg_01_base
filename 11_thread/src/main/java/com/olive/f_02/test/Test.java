package com.olive.f_02.test;

import cn.hutool.core.util.RandomUtil;

import java.util.LinkedList;
import java.util.List;

/**
 * @description: Test
 * @date: 2023/12/20 14:58
 * @author: olive
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(5);
        list.add(3);
        list.add(12);
        list.add(7);
        while (true) {
            if (list.size() > 0) {
                int ii = RandomUtil.randomInt(list.size());
                System.out.println("随机数：" + ii);
                list.remove(ii);
                System.out.println("--------------------------------");
                for (int i = 0; i < list.size(); i++) {
                    System.out.print(" " + list.get(i));
                }
            } else {
                break;
            }

        }


    }
}
