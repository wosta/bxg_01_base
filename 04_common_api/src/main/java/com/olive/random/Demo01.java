package com.olive.random;

import java.util.Random;

/**
 * @description: Demo01
 * @date: 2023/6/17 9:35
 * @author: olive
 * @version: 1.0
 */
public class Demo01 {
    public static void main(String[] args) {
        /*   需求：
            定义方法实现随机产生一个5位的验证码
            验证码格式：
            长度为5
            前四位是大写字母或者小写字母
            最后一位是数字
     */
        char[] chars = {'a', 'b', 'c', 'A', 'B', 'C'};
        int[] ints = {1, 2, 3, 4, 5};
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            System.out.print(chars[random.nextInt(chars.length)]);
        }
        System.out.println(ints[random.nextInt(ints.length)]);
    }
}
