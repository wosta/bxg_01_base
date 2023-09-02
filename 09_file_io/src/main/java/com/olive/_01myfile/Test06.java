package com.olive._01myfile;

import java.io.File;
import java.util.HashMap;

/**
 * @description: Test06
 * @date: 2023/8/6 16:07
 * @author: olive
 * @version: 1.0
 */
public class Test06 {
    public static void main(String[] args) {
        /*
            需求：统计一个文件夹中每种文件的个数并打印。（考虑子文件夹）
            打印格式如下：
            txt:3个
            doc:4个
            jpg:6个
        */
        File file = new File("F://IT//Java//temp");
        HashMap<String, Integer> map = new HashMap<>();
        fileList(file, map);
        System.out.println(map);
    }

    private static void fileList(File file, HashMap<String, Integer> map) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                fileList(f, map);
            } else {
                String[] split = f.getName().split("\\.");
                Integer integer = map.get(split[1]);
                if (integer == null) {
                    map.put(split[1], 1);
                } else {
//                    integer = integer + 1;
                    map.put(split[1], integer);
//                    map.put(split[1], integer++);
                }
            }
        }
    }
}
