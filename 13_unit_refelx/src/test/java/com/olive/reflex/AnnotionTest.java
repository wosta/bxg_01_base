package com.olive.reflex;

import com.olive.anotions.MyTest4;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @description: AnnotionTest
 * @date: 2023/12/8 13:15
 * @author: olive
 * @version: 1.0
 */
public class AnnotionTest {

    @Test
    public void test() throws Exception {
        Class c = Class.forName("com.olive.anotions.Demo");
        MyTest4 mt = (MyTest4) c.getDeclaredAnnotation(MyTest4.class);
        double aaa = mt.aaa();
        String value = mt.value();
        String[] bbb = mt.bbb();
        System.out.println(aaa + " " + Arrays.toString(bbb) + " " + value);
    }

    @Test
    public void test1() throws Exception {
        Class c = Class.forName("com.olive.anotions.Demo");
        Method test1 = c.getDeclaredMethod("test1");
        MyTest4 mt = (MyTest4) test1.getDeclaredAnnotation(MyTest4.class);
        double aaa = mt.aaa();
        String value = mt.value();
        String[] bbb = mt.bbb();
        System.out.println(aaa + " " + Arrays.toString(bbb) + " " + value);
    }
}
