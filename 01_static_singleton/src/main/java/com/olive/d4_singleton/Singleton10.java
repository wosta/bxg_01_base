package com.olive.d4_singleton;

/**
 * @author olive
 * @version 1.0
 * @date Created in 2022/10/30 10:54
 * @modified By
 */
public class Singleton10 {
    private static final ThreadLocal<Singleton10> tl = new ThreadLocal<Singleton10>(){
        @Override
        protected Singleton10 initialValue() {
            return new Singleton10();
        }
    };
    private Singleton10(){}
    public static Singleton10 getInstance(){
        return tl.get();
    }

    public static void main(String[] args) {
        Singleton10 instance = Singleton10.getInstance();
        System.out.println(instance);
        Singleton10 instance1 = Singleton10.getInstance();
        System.out.println(instance1);
        Singleton10 instance2 = Singleton10.getInstance();
        System.out.println(instance2);
        new Thread(()->{
            Singleton10 instance3 = Singleton10.getInstance();
            System.out.println(instance3);
        }).start();
        new Thread(()->{
            Singleton10 instance4 = Singleton10.getInstance();
            System.out.println(instance4);
        }).start();
        new Thread(()->{
            System.out.println(Singleton10.getInstance());
        }).start();

    }
}
