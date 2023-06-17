package com.olive.mapo;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @description: Demo03
 * @date: 2023/6/15 21:11
 * @author: olive
 * @version: 1.0
 */
public class Demo03 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>((o1, o2) -> {
            return o2.compareTo(o1);
        });
        tm.put(5,"可恰可乐");
        tm.put(4,"雷碧");
        tm.put(3,"九个核桃");
        tm.put(2,"康帅傅");
        tm.put(1,"粤利粤");
        System.out.println(tm);
    }
}
