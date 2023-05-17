package com.olive.myfile01;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) throws IOException {
        //需求：在当前模块下的aaa文件夹中创建一个a.txt文件
        File file = new File("09_file_io\\aaa");
        System.out.println(file.getAbsoluteFile());
        if (!file.exists()) {
            file.mkdirs();
        }
        File aText = new File(file, "a.txt");
        System.out.println(aText.createNewFile());
    }
}
