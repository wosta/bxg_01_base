package com.olive._01myfile;

import java.io.File;

/**
 * @description: Test05
 * @date: 2023/8/6 15:42
 * @author: olive
 * @version: 1.0
 */
public class Test05 {
    public static void main(String[] args) {
         /*需求：
            统计一个文件夹的总大小
      */
        File file = new File("F://IT//Java//temp");
        long sum = fileSize(file);
//        long sum = getLen(file);
        System.out.println(sum);
    }

    private static long fileSize(File file) {
        long sum = 0;
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                sum = sum + fileSize(f);
            }
        } else {
            sum += file.length();
        }
        return sum;
    }

    public static long getLen(File src) {
        //1.定义变量进行累加
        long len = 0;
        //2.进入src文件夹
        File[] files = src.listFiles();
        //3.遍历数组
        for (File file : files) {
            //4.判断
            if (file.isFile()) {
                //我们就把当前文件的大小累加到len当中
                len = len + file.length();
            } else {
                //判断，如果是文件夹就递归
                len = len + getLen(file);
            }
        }
        return len;
    }
}
