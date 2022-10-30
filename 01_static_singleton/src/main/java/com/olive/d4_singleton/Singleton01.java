package com.olive.d4_singleton;

/**
 * @author olive
 * @version 1.0
 * @date Created in 2022/10/29 10:40
 * @description
 * @modified By
 */
public class Singleton01 {
    private static Singleton01 singleton = new Singleton01();
    private Singleton01() {}
    public static Singleton01 getInstance() {
        return singleton;
    }
}
