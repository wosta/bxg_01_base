package com.olive.mapo;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * @description: Demo01
 * @date: 2023/6/14 22:50
 * @author: olive
 * @version: 1.0
 */
public class Demo01 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        //2.添加元素
        //键：人物的名字
        //值：名人名言
        map.put("鲁迅","这句话是我说的");
        map.put("曹操","不可能绝对不可能");
        map.put("刘备","接着奏乐接着舞");
        map.put("柯镇恶","看我眼色行事");

        map.forEach((key, value) -> {
            System.out.println(key + ", " + value);
        });

        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {

            }
        });

    }
}
