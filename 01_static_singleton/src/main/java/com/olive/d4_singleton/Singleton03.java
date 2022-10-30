package com.olive.d4_singleton;

/**
 * @author olive
 * @version 1.0
 * @date Created in 2022/10/29 10:48
 * @description
 * @modified By
 */
public class Singleton03 {
    private static Singleton03 singleton;
    static {
        singleton = new Singleton03();
    }
    private Singleton03() {}
    public static Singleton03 getInstance() {
        return singleton;
    }

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton03 instance = Singleton03.getInstance();
                System.out.println(instance);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton03 instance = Singleton03.getInstance();
                System.out.println(instance);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton03 instance = Singleton03.getInstance();
                System.out.println(instance);
            }
        }).start();
    }
}
