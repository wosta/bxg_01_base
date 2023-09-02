package com.olive.map230628;

import java.util.StringJoiner;
import java.util.TreeMap;

/**
 * @description: Demo04
 * @date: 2023/6/29 21:47
 * @author: olive
 * @version: 1.0
 */
public class Demo04 {
    public static void main(String[] args) {
        /* 需求：
        字符串“aababcabcdabcde”
        请统计字符串中每一个字符出现的次数，并按照以下格式输出
        输出结果：
        a（5）b（4）c（3）d（2）e（1）
        */
        String str = "aababcabcdabcde";
        TreeMap<String, Integer> ts = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            Integer integer = ts.get(String.valueOf(c));
            if (integer == null) {
                ts.put(String.valueOf(c), 1);
            } else {
                ts.put(String.valueOf(c), integer + 1);
            }
        }
        System.out.println(ts);
        StringBuffer sb = new StringBuffer();
//        for (Map.Entry<String, Integer> stringIntegerEntry : ts.entrySet()) {
//            sb.append((stringIntegerEntry.getKey()));
//            sb.append("(");
//            sb.append(stringIntegerEntry.getValue());
//            sb.append(")");
//        }
//        System.out.println(sb.toString());
        ts.forEach((s, i) -> {
            sb.append(s).append("(").append(i).append(")");
        });
        System.out.println(sb.toString());

        StringJoiner sj = new StringJoiner("", "", "");
        System.out.println(sj);
    }
}
