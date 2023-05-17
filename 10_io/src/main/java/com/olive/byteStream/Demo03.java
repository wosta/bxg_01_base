package com.olive.byteStream;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo03 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("10_io\\a.txt");
//        char b = (char) fis.read();
//        System.out.println(b);
//        b = (char) fis.read();
//        System.out.println(b);
//        b = (char) fis.read();
//        System.out.println(b);

        int b = 0;
        while ((b = fis.read()) != -1) {
            System.out.print((char)b);
        }
        fis.close();
    }
}
