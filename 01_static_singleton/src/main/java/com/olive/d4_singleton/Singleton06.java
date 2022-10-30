package com.olive.d4_singleton;

/**
 * @author olive
 * @version 1.0
 * @date Created in 2022/10/29 21:32
 * @modified By
 */
public class Singleton06 {
    private static Singleton06 singleton ;
    private Singleton06(){}
    private static class GetInstance {
//        private static Singleton06 createSingleton() {
//            singleton = new Singleton06();
//            return singleton;
//        }
        private final static Singleton06 SINGLETON = new Singleton06();
    }

    public static Singleton06 getInstance() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return GetInstance.SINGLETON;
    }

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Singleton06.getInstance());
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Singleton06.getInstance());
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Singleton06.getInstance());
            }
        }).start();
    }
}
