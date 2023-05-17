package charStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo04 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("10_io\\c.txt");
        fr.read();
        FileWriter fw = new FileWriter("10_io\\c_copy.txt");

        int b ;
        while ((b = fr.read()) != -1) {
            System.out.print((char)b);
        }

        fw.close();
        fr.close();
    }
}
