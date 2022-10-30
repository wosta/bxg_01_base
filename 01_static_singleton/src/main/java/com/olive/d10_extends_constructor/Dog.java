package com.olive.d10_extends_constructor;

/**
 * @author olive
 * @version 1.0
 * @date Created in 2022/10/30 11:45
 * @modified By
 */
public class Dog extends Animal {
    public Dog () {
//        super();
    }
    public Dog(String name) {
        super(name);
    }

    @Override
    public void run() {

    }
}
