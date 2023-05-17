package charSet;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "ai你悠";
        byte[] bytes = s.getBytes();
        String c = Arrays.toString(bytes);
        System.out.println(c);

        String newStr = new String(bytes);
        System.out.println(newStr);

        bytes = s.getBytes("GBK");
        c = Arrays.toString(bytes);
        System.out.println(c);


        newStr = new String(bytes, "GBK");
        System.out.println("newStr = " + newStr);
    }
}
