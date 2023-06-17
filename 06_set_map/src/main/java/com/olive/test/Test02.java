package com.olive.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @description: Test02
 * @date: 2023/6/15 22:08
 * @author: olive
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        /* 班级里有N个学生
        要求：
        70%的概率随机到男生
        30%的概率随机到女生
        "范闲","范建","范统","杜子腾","宋合泛","侯笼藤","朱益群","朱穆朗玛峰",
        "杜琦燕","袁明媛","李猜","田蜜蜜",
        */
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 0, 0, 0};
        int index = new Random().nextInt(nums.length);
        ArrayList<Object> boys = new ArrayList<>();
        Collections.addAll(boys,"范闲", "范建", "范统", "杜子腾", "宋合泛", "侯笼藤", "朱益群", "朱穆朗玛峰");
        ArrayList<Object> girls = new ArrayList<>();
        Collections.addAll(girls,"杜琦燕","袁明媛","李猜","田蜜蜜");
        if (nums[index] == 1) {
            Collections.shuffle(boys);
            System.out.println(boys.get(0));
        }else {
            Collections.shuffle(girls);
            System.out.println(girls.get(0));
        }
    }
}
