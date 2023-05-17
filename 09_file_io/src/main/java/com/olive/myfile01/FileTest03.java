package com.olive.myfile01;

import java.io.File;

public class FileTest03 {
    public static void main(String[] args) {
        /* 需求：
        找到电脑中所有以avi结尾的电影。（需要考虑子文件夹）
        套路：
            1，进入文件夹
            2，遍历数组
            3，判断
            4，判断
        */
        File file = new File("F:\\IT\\Java");
        fileAllAVI(file);
    }

    private static void fileAllAVI(File file) {
        if (file.isDirectory()) {
            for (File listFile : file.listFiles()) {
                if (listFile.isDirectory()) {
                    fileAllAVI(listFile);
                }else {
                    if (listFile.getName().contains(".avi")) {
                        System.out.println(listFile.getName());
                    }
                }
            }
       }else {
            if (file.getName().contains(".avi")) {
                System.out.println(file.getName());
            }
        }
    }
}
