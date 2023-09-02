package com.olive.map230628;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @description: Demo02
 * @date: 2023/6/28 22:47
 * @author: olive
 * @version: 1.0
 */
public class Demo02 {
    public static void main(String[] args) {
        /*
            某个班级80名学生，现在需要组成秋游活动，
            班长提供了四个景点依次是（A、B、C、D）,
            每个学生只能选择一个景点，请统计出最终哪个景点想去的人数最多。
        */
        //1.需要先让同学们投票
        //定义一个数组，存储4个景点
        String[] arr = {"A", "B", "C", "D"};
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 0);
        map.put("B", 0);
        map.put("C", 0);
        map.put("D", 0);
        Random random = new Random();
        for (int i = 0; i < 80; i++) {
            int index = random.nextInt(4);
            Integer integer = map.get(arr[index]);
            map.put(arr[index], integer + 1);
        }
        map.forEach((s, i) -> {
            System.out.println(s + ", " + i);
        });
    }
}
