package com.olive.d8_extends_field;

/**
 * @author olive
 * @version 1.0
 * @date Created in 2022/10/30 11:30
 * @modified By
 */
public class Test {
    public static void main(String[] args) {
        Animals a = new Dog();
        System.out.println(a.name);
        a.run();

        Dog dog = new Dog();
        System.out.println(dog.name);

        dog.show();
    }
}

class Animals{
    String name = "动物";
    public void run() {
        System.out.println("animal is running.");
    }
}

class Dog extends Animals {
    String name = "狗";
    public void watchDoor() {
        System.out.println("dog is watching the door...");
    }

    public void show() {
        String name = "show name";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
