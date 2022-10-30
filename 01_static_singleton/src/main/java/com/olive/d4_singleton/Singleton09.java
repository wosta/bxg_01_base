package com.olive.d4_singleton;

/**
 * @author olive
 * @version 1.0
 * @date Created in 2022/10/30 9:50
 * @modified By
 */
public class Singleton09 {
    private static volatile Singleton09 singleton;
    private Singleton09(){}
    public static Singleton09 getInstance() {
        if (singleton == null) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized(Singleton09.class) {
                if (singleton == null) {
                    singleton = new Singleton09();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Singleton09.getInstance());
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Singleton09.getInstance());
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Singleton09.getInstance());
            }
        }).start();
    }
}
