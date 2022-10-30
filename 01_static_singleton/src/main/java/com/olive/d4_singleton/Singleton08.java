package com.olive.d4_singleton;

/**
 * @author olive
 * @version 1.0
 * @date Created in 2022/10/30 9:43
 * @modified By
 */
public class Singleton08 {
    private static Singleton08 singleton;
    private Singleton08 (){}
    public static Singleton08 getInstance(){
        if (singleton == null) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (Singleton08.class) {
                if (singleton == null) {
                    singleton = new Singleton08();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Singleton08.getInstance());
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Singleton08.getInstance());
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Singleton08.getInstance());
            }
        }).start();
    }
}
