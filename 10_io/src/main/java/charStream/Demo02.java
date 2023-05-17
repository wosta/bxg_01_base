package charStream;

import java.io.FileReader;
import java.io.IOException;

public class Demo02 {
    public static void main(String[] args) throws IOException {
//        FileReader fr = new FileReader("10_io\\c.txt");
//        int len;
//        char[] bytes = new char[2];
//        while ((len = fr.read()) != -1) {
//            System.out.println(new String(bytes, 0, len));
//        }
//        fr.close();

        //1.创建对象
        FileReader fr = new FileReader("10_io\\c.txt");
        //2.读取数据
        char[] chars = new char[2];
        int len;
        //read(chars)：读取数据，解码，强转三步合并了，把强转之后的字符放到数组当中
        //空参的read + 强转类型转换
        while((len = fr.read(chars)) != -1){
            //把数组中的数据变成字符串再进行打印
            System.out.print(new String(chars,0,len));
        }
        //3.释放资源
        fr.close();
    }
}
