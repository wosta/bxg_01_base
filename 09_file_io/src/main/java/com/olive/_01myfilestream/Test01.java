package com.olive._01myfilestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @description: Test01
 * @date: 2023/8/6 16:32
 * @author: olive
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) throws Exception {
        //拷贝一个文件夹，考虑子文件夹
        File file1 = new File("F://IT//Java//temp");
        File file2 = new File("F://IT//Java//temp1");
        copy(file1, file2);
    }

    private static void copy(File file1, File file2) throws FileNotFoundException {
        File[] files = file1.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                file2 = new File(file1, file.getName());
                file2.mkdirs();
                copy(file, file2);
            } else {
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(file2);
//                int
//                if ()
            }
        }
    }
}
