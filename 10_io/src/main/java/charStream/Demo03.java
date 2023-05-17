package charStream;

import java.io.FileWriter;
import java.io.IOException;

public class Demo03 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("F:\\IT\\Java\\temp\\fw.txt");
        fw.write("ai哎呦喂~");
        fw.write(98);
        fw.write(new char[]{98, 97, 96, '我'});
        fw.close();
    }
}
