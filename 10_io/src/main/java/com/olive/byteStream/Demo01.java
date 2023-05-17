package com.olive.byteStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        /*
         * 演示：字节输出流FileOutputStream
         * 实现需求：写出一段文字到本地文件中。（暂时不写中文）
         *
         * 实现步骤：
         *       创建对象
         *       写出数据
         *       释放资源
         * */
        FileOutputStream fos = new FileOutputStream(new File("F:\\IT\\Java\\temp\\byte.txt"));
        fos.write(98);
        fos.write(99);
        fos.close();

        fos = new FileOutputStream("10_io\\b.txt");
        byte[] bytes = {'a', 'l', 'o', 'u'};
        fos.write(bytes, 2, 1);
        fos.close();
    }
}
