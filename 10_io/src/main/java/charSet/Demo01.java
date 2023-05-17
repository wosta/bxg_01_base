package charSet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("10_io\\c.txt");
        FileOutputStream fos = new FileOutputStream("10_io\\c_copy.txt");
        int b ;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }
//        int read = fis.read();
//        System.out.println((char) read);

        fos.close();
        fis.close();

    }
}
