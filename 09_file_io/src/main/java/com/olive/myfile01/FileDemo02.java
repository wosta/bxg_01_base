package com.olive.myfile01;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileDemo02 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("F:\\IT\\Java\\temp");
        System.out.println(file1.isFile());
        System.out.println(file1.isDirectory());
        System.out.println(file1.exists());

//        boolean newFile1 = new File("F:\\IT").mkdir();
//        boolean newFile2 = new File("F:\\IT\\Java\\temp").mkdirs();
//        System.out.println(newFile1);
//        System.out.println(newFile2);

        File file2 = new File(file1, "a.txt");
        System.out.println(file2.exists());
//        System.out.println(file2.createNewFile());
        System.out.println(file2.length());
        System.out.println(file2.lastModified());
        System.out.println(file2.getName());
        System.out.println(file2.getAbsoluteFile());


//        System.out.println(file2.delete());

        File[] files = file1.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
        System.out.println("------------");
        for (File file : File.listRoots()) {
            System.out.println(file);
        }
        System.out.println("-----");

        String[] list = file1.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.contains(".txt");
            }
        });
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("======");
        File[] files1 = file1.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                System.out.println(pathname);
                return false;
            }
        });
        for (File file : files1) {
            System.out.println(file);
        }
    }
}
