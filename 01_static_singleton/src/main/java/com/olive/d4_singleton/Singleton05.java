package com.olive.d4_singleton;

/**
 * @author olive
 * @version 1.0
 * @date Created in 2022/10/29 10:58
 * @modified By
 */
public class Singleton05 {
    private static Singleton05 singleton;
    private Singleton05(){}

    public static synchronized Singleton05 getInstance() {
        if (singleton == null) {
            singleton = new Singleton05();
        }
        return singleton;
    }

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Singleton05.getInstance() = " + Singleton05.getInstance());
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Singleton05.getInstance() = " + Singleton05.getInstance());
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Singleton05.getInstance() = " + Singleton05.getInstance());
            }
        }).start();
    }
}
