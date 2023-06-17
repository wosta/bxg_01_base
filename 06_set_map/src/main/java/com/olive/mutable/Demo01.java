package com.olive.mutable;

import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * @description: Demo01
 * @date: 2023/6/17 10:43
 * @author: olive
 * @version: 1.0
 */
public class Demo01 {
    public static void main(String[] args) {
        List<String> words = List.of("a", "b", "c");
        String s1 = words.get(0);
        System.out.println(s1);
        words.add("d");
        System.out.println(JSON.toJSONString(words, true));
    }
}
