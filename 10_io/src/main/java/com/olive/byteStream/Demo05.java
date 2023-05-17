package com.olive.byteStream;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo05 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("10_io\\a.txt");
//        byte[] bytes = new byte[2];
//        char read = (char) fis.read(bytes, 1, 1);
//        System.out.println(read);

        //2.读取数据
        byte[] bytes = new byte[5];
        //一次读取多个字节数据，具体读多少，跟数组的长度有关
        //返回值：本次读取到了多少个字节数据
        int len1 = fis.read(bytes);
        System.out.println(len1);//2
        String str1 = new String(bytes,0,len1);
        System.out.println(str1);
    }
}
