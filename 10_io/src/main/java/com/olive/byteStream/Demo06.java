package com.olive.byteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo06 {
    public static void main(String[] args) throws IOException {
        /*
         *   练习：
         *       文件拷贝
         *       把D:\itheima\movie.mp4 (16.8 MB) 拷贝到当前模块下。
         *
         * */
        FileInputStream fis = new FileInputStream("F:\\IT\\Java\\temp\\1.mp4");
        FileOutputStream fos = new FileOutputStream("10_io\\2.mp4");
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        fos.close();
        fis.close();
    }
}
