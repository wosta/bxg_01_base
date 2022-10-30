package com.olive.d4_singleton;

/**
 * @author olive
 * @version 1.0
 * @date Created in 2022/10/29 10:51
 * @modified By
 */
public class Singleton04 {
    private static Singleton04 singleton;
    private Singleton04() {}
    public static Singleton04 getInstance() {
        if (singleton == null) {
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            singleton = new Singleton04();
        }
        return singleton;
    }


}
