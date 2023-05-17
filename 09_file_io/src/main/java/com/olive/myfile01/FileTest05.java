package com.olive.myfile01;

import java.io.File;

public class FileTest05 {
    public static void main(String[] args) {
        /*需求：
            统计一个文件夹的总大小
        */
        File file = new File("D:\\workspace");
        long length = 0;
        long result = fileStatistics(file);
        System.out.println(result);
    }

    private static long fileStatistics(File file) {
        //1.定义变量进行累加
        long length = 0;
        //2.遍历数组
        for (File listFile : file.listFiles()) {
            if (listFile.isDirectory()) {
                //判断，如果是文件夹就递归
                length += fileStatistics(listFile);
            }else {
                //我们就把当前文件的大小累加到len当中
                length += listFile.length();
            }
        }
        return length;
    }
}
