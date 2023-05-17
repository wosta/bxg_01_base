package charStream;

import java.io.FileReader;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("10_io\\c.txt");
        int b;
        while ((b = fr.read()) != -1) {
            System.out.print((char) b);
        }
        fr.close();
    }
}
