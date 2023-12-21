package com.olive.annotions_f_02;

import java.lang.reflect.Method;

/**
 * @description: Demo
 * @date: 2023/12/9 9:15
 * @author: olive
 * @version: 1.0
 */
public class Demo {

    @MyJUnit
    public static void test() {
        System.out.println("---test----");
    }

    @MyJUnit
    public static void test2() {
        System.out.println("---test2----");
    }

    @MyJUnit
    public static void test3() {
        System.out.println("---test3----");
    }

    public static void test4() {
        System.out.println("---test4----");
    }


    public static void main(String[] args) throws Exception {
        Demo demo = new Demo();
        Class c = demo.getClass();
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyJUnit.class)) {
                method.invoke(demo);
            }
        }
    }
}
