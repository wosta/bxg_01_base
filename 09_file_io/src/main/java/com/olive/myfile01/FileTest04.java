package com.olive.myfile01;

import java.io.File;

public class FileTest04 {
    public static void main(String[] args) {
         /*
           删除一个多级文件夹
           如果我们要删除一个有内容的文件夹
           1.先删除文件夹里面所有的内容
           2.再删除自己
        */
        File file = new File("F:\\IT\\Java\\temp\\c");
        deleteFile(file);
    }

    private static void deleteFile(File file) {
        for (File listFile : file.listFiles()) {
            if (listFile.isDirectory()) {
                deleteFile(listFile);
            }else {
                file.delete();
            }
            listFile.delete();
        }
    }
}
