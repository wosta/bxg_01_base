package th01.th02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @description: DemoReceive
 * @date: 2023/6/25 9:03
 * @author: olive
 * @version: 1.0
 */
public class DemoReceive {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);
        byte[] buffer = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
        System.out.println("1111");
        ds.receive(dp);
        byte[] data = dp.getData();
        int len = dp.getLength();
        InetAddress address = dp.getAddress();
        int port = dp.getPort();
        System.out.println("接受的数据" + new String(data, 0, len));
        System.out.println("接受的数据" + address + "port: " + port);
        ds.close();
    }
}
