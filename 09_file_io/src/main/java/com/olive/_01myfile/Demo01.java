package com.olive._01myfile;

import java.io.File;

/**
 * @description: Demo01
 * @date: 2023/7/22 22:45
 * @author: olive
 * @version: 1.0
 */
public class Demo01 {
    public static void main(String[] args) {
        String file = "F:\\IT\\Java\\temp\\a.txt";
        System.out.println("file = " + file);
        File f = new File(file);
        System.out.println("f = " + f);

        File f1 = new File("F:\\IT\\Java\\temp");
        System.out.println(f1.isDirectory());
        File f2 = new File(f1, "a.avi");
        System.out.println("f2 = " + f2);
        System.out.println(f2.isDirectory());
    }
}
