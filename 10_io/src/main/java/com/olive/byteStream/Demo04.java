package com.olive.byteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo04 {
    public static void main(String[] args) throws IOException {
        /*
         *   练习：
         *       文件拷贝
         *       把D:\itheima\movie.mp4拷贝到当前模块下。
         *   注意：
         *       选择一个比较小的文件，不要太大。大文件拷贝我们下一个视频会说。
         *   课堂练习：
         *       要求统计一下拷贝时间，单位毫秒
         * */
        File file = new File("F:\\IT\\Java\\temp\\1.mp4");
        System.out.println(file.length());
        FileInputStream fis = new FileInputStream("F:\\IT\\Java\\temp\\1.mp4");
        FileOutputStream fos = new FileOutputStream("10_io\\1.mp4");

        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }

        fos.close();
        fis.close();
    }
}
