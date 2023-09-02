package th01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @description: Demo
 * @date: 2023/6/24 16:28
 * @author: olive
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress byName = InetAddress.getByName("行远自迩");
        System.out.println("byName = " + byName);

        String hostName = byName.getHostName();
        System.out.println("hostName = " + hostName);

        String hostAddress = byName.getHostAddress();
        System.out.println("hostAddress = " + hostAddress);

    }
}
