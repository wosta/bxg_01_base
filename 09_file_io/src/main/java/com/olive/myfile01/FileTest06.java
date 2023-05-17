package com.olive.myfile01;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class FileTest06 {
    public static void main(String[] args) {
         /*
            需求：统计一个文件夹中每种文件的个数并打印。（考虑子文件夹）
            打印格式如下：
            txt:3个
            doc:4个
            jpg:6个
        */
        File file = new File("F:\\IT\\Java\\temp");
        Map<String, Integer> statistic = new HashMap<>();
        statisticsFile(statistic, file);
        System.out.println(statistic);
    }

    private static void statisticsFile(Map<String, Integer> statistics, File file) {
        for (File listFile : file.listFiles()) {
            if (listFile.isDirectory()) {
                statisticsFile(statistics, listFile);
            }else {
                String name = listFile.getName();
                String[] split = name.split("\\.");
                Integer integer = statistics.get(split[1]);
                statistics.put(split[1], integer == null ? 1: integer + 1);
            }
        }
    }
}
