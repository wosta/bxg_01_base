package com.olive.anotions;

import java.lang.reflect.Method;

/**
 * @description: MyTestAnno
 * @date: 2023/12/8 13:30
 * @author: olive
 * @version: 1.0
 */
public class MyTestAnno {
    @MyTest
    public static void test1() {
        System.out.println("---test1----");
    }

    public static void test2() {
        System.out.println("---test2----");
    }

    @MyTest
    public static void test3() {
        System.out.println("---test3----");
    }

    @MyTest
    public static void test4() {
        System.out.println("---test4----");
    }

    public static void main(String[] args) throws Exception {
        Class c = Class.forName("com.olive.anotions.MyTestAnno");
        Method[] declaredMethods = c.getDeclaredMethods();
        MyTestAnno myAnno = new MyTestAnno();
        for (Method method : declaredMethods) {
            if (method.isAnnotationPresent(MyTest.class)) {
                method.invoke(myAnno);
            }
        }
    }
}
