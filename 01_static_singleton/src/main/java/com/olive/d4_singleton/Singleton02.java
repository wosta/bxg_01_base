package com.olive.d4_singleton;

/**
 * @author olive
 * @version 1.0
 * @date Created in 2022/10/29 10:46
 * @description
 * @modified By
 */
public class Singleton02 {
    private final static Singleton02 INSTANCE = new Singleton02();
    private Singleton02() {}
    public Singleton02 getInstance() {
        return INSTANCE;
    }
}
