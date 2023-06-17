package com.olive.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @description: Test03
 * @date: 2023/6/17 10:29
 * @author: olive
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) {
        /* 班级里有5个学生
        要求：
        被点到的学生不会再被点到。
        但是如果班级中所有的学生都点完了，需要重新开启第二轮点名。*/
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "刘备", "关羽", "张飞", "赵云", "黄忠");
        while (list.size() > 0) {
            int i = new Random().nextInt(list.size());
            System.out.println(list.get(i));
            list.remove(i);
        }
    }
}
