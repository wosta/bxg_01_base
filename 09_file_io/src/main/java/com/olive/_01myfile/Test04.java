package com.olive._01myfile;

import java.io.File;

/**
 * @description: Test04
 * @date: 2023/8/6 15:35
 * @author: olive
 * @version: 1.0
 */
public class Test04 {
    public static void main(String[] args) {
         /*
           删除一个多级文件夹
           如果我们要删除一个有内容的文件夹
           1.先删除文件夹里面所有的内容
           2.再删除自己
        */
        File file = new File("F:\\IT\\Java\\tmp");
        deleteFile(file);
    }

    private static void deleteFile(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                deleteFile(f);
            }
            file.delete();
        } else {
            file.delete();
        }
    }
}
