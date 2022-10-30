package com.olive.d4_singleton;

/**
 * @author olive
 * @version 1.0
 * @date Created in 2022/10/29 10:53
 * @modified By
 */
public class Test {
    public static void main(String[] args) {
//        test04();
        test07();
    }

    private static void test07() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton07 instance = Singleton07.INSTANCE;
                instance.doSomeing();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton07 instance = Singleton07.INSTANCE;
                instance.doSomeing();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton07 instance = Singleton07.INSTANCE;
                instance.doSomeing();
            }
        }).start();
    }

    private static void test04() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton04 instance = Singleton04.getInstance();
                System.out.println("instance = " + instance);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton04 instance = Singleton04.getInstance();
                System.out.println("instance = " + instance);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton04 instance = Singleton04.getInstance();
                System.out.println("instance = " + instance);
            }
        }).start();
    }
}
