package th01.th02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @description: Demo
 * @date: 2023/6/25 8:55
 * @author: olive
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        String str = "你好啊。。。";
        byte[] bytes = str.getBytes();
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 10086;
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);
        ds.send(dp);
        ds.close();
    }
}
