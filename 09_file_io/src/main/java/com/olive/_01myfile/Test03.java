package com.olive._01myfile;

import java.io.File;

/**
 * @description: Test03
 * @date: 2023/8/6 15:16
 * @author: olive
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) {
         /* 需求：
        找到电脑中所有以avi结尾的电影。（需要考虑子文件夹）
        套路：
            1，进入文件夹
            2，遍历数组
            3，判断
            4，判断
        */
        findAVI(new File("F:\\IT\\Java\\temp"));
    }

    private static void findAVI(File file) {
        File[] files = file.listFiles();
        if (null != files) {
            for (File f : files) {
                if (f.isDirectory()) {
                    findAVI(f);
                } else {
                    if (f.getName().endsWith(".avi")) {
                        System.out.println(f);
                    }
                }
            }
        }
    }
}
