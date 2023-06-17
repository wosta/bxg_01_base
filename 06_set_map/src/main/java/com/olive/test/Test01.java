package com.olive.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @description: Test01
 * @date: 2023/6/15 22:03
 * @author: olive
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
         /* 班级里有N个学生，学生属性:姓名，年龄，性别。
        实现随机点名器。*/
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "范闲", "范建", "范统", "杜子腾", "杜琦燕", "宋合泛", "侯笼藤", "朱益群", "朱穆朗玛峰", "袁明媛");
        System.out.println("list = " + list);

        Collections.shuffle(list);
        System.out.println("list = " + list);
    }
}
