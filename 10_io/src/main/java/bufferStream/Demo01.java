package bufferStream;

import java.io.*;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:\\IT\\Java\\temp\\1.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("10_io\\1.mp4"));
        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }
        bos.close();
        bis.close();
    }
}
