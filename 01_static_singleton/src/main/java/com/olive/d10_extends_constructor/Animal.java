package com.olive.d10_extends_constructor;

/**
 * @author olive
 * @version 1.0
 * @date Created in 2022/10/30 11:44
 * @modified By
 */
public class Animal {
    private String name ;
    public Animal() {
        System.out.println("animal no param constructor..");
    }
    public Animal(String name) {
        this.name = name;
        System.out.println("animal constructor with name..");
    }

    public void run() {
        System.out.println("animal is running.");
    }
}
