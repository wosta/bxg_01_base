package com.olive;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @description: Demo
 * @date: 2023/6/25 10:10
 * @author: olive
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName("com.olive.Person");
//        System.out.println(aClass);
//        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
//        for (int i = 0; i < declaredConstructors.length; i++) {
//            System.out.println(declaredConstructors[i]);
//        }
        Constructor<?> constructor = aClass.getDeclaredConstructor(String.class, int.class);
        System.out.println(constructor);
        Object zs = constructor.newInstance("zs", 18);
        System.out.println(zs);
//        Object o = constructor.newInstance();
//        System.out.println(o);
    }
}
