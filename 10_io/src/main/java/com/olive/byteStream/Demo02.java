package com.olive.byteStream;

import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("10_io\\a.txt");
        String s1 = "I like apples";
        byte[] bytes = s1.getBytes();
        fos.write(bytes);

        fos.write("\r\n".getBytes());

        fos.write("666".getBytes());
        fos.close();
    }
}
