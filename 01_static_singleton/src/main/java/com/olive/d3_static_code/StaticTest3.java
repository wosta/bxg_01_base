package com.olive.d3_static_code;

import java.util.ArrayList;
import java.util.List;

/**
 * @author olive
 * @version 1.0
 * @date Created in 2022/10/29 10:20
 * @description 发牌
 * @modified By
 */
public class StaticTest3 {
    //    private static String[] nums = new String[13];
//    private static String[] flowers = new String[4];
    private static final List<String> cards = new ArrayList<>();

    static {
        String[] nums = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] flowers = {"♥", "♠", "♦", "♣"};
        for (String num : nums) {
            for (String flower : flowers) {
                cards.add(flower + num);
            }
        }
        cards.add("大王");
        cards.add("小王");
    }

    public static void main(String[] args) {
//        System.out.println(StaticTest3.nums);
        System.out.println(cards);
    }
}
