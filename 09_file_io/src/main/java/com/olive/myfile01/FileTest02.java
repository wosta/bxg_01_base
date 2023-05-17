package com.olive.myfile01;

import java.io.File;

public class FileTest02 {
    public static void main(String[] args) {
         /*需求：
             定义一个方法找某一个文件夹中，是否有以avi结尾的电影。
	        （暂时不需要考虑子文件夹）
        */
        File file = new File("F:\\IT\\Java\\temp");
        boolean result = haveAVI(file);
        System.out.println(result);
    }

    private static boolean haveAVI(File file) {
        File[] files = file.listFiles((x, y) -> {
            return y.contains(".avi");
        });
        return files.length > 0;
    }
}
