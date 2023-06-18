package stream;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @description: Demo10
 * @date: 2023/6/18 15:40
 * @author: olive
 * @version: 1.0
 */
public class Demo10 {
    @Test
    public void streamFromFile() throws IOException {
        Files.lines(
                Paths.get("D:\\workspace\\java\\itcast\\bxg\\bxg_01_base\\07_stream_exception\\07_stream_exception\\src\\main\\java\\stream\\Demo09.java"))
                .forEach(System.out::println);

    }
}
