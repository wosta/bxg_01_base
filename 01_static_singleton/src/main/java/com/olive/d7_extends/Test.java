package com.olive.d7_extends;

/**
 * @author olive
 * @version 1.0
 * @date Created in 2022/10/29 21:25
 * @modified By
 */
public class Test {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
//        tiger.eat();
        System.out.println(Tiger.location);
    }

}

class Animals {
    private void eat() {
        System.out.println("动物吃啥...");
    }

    public static String location = "北京";
}

class Tiger extends Animals {

}
