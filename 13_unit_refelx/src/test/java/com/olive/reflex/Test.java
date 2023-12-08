package com.olive.reflex;

import java.lang.reflect.Constructor;

/**
 * @description: Test
 * @date: 2023/12/8 10:02
 * @author: olive
 * @version: 1.0
 */
public class Test {
    @org.junit.Test
    public void test() throws ClassNotFoundException {
        Class c1 = Student.class;
        Class c2 = Class.forName("com.olive.reflex.Student");
        Student s1 = new Student();
        Class c3 = s1.getClass();
        System.out.println(c1 == c2);
        System.out.println(c2 == c3);
        System.out.println(c3);

    }

    @org.junit.Test
    public void test_constructor() throws ClassNotFoundException {
        Class c1 = Class.forName("com.olive.reflex.Student");
        Constructor[] declaredConstructors = c1.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            String name = declaredConstructor.getName();
            System.out.println("name = " + name + ", parame count = " + declaredConstructor.getParameterCount());
        }
    }

    @org.junit.Test
    public void test_teacher() throws ClassNotFoundException {
        Class c = Class.forName("com.olive.reflex.Teacher");
        Constructor[] declaredConstructors = c.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            String name = declaredConstructor.getName();
            System.out.println("name = " + name + ", parame count = " + declaredConstructor.getParameterCount());
        }
    }

    @org.junit.Test
    public void test_get_construct() throws Exception {
        Class c = Class.forName("com.olive.reflex.Student");
        Constructor constructor = c.getDeclaredConstructor(int.class, String.class);
        String name = constructor.getName();
        int parameterCount = constructor.getParameterCount();
        System.out.println("name = " + name);
        System.out.println(parameterCount);
    }

    @org.junit.Test
    public void test_newInstance() throws Exception {
        Class c = Class.forName("com.olive.reflex.Student");
        Constructor constructor = c.getDeclaredConstructor(int.class, String.class);
        constructor.setAccessible(true);
        Student s = (Student) constructor.newInstance(1, "zs");
        System.out.println("s = " + s);
    }

    @org.junit.Test
    public void test_save() throws Exception {
        SaveObject so = new SaveObject();
        Student s = new Student();
        s.setId(10);
        s.setName("zs");
        so.save(s);
    }
}
