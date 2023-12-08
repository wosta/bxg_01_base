package com.olive.reflex;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.lang.reflect.Field;

/**
 * @description: SaveObject
 * @date: 2023/12/8 11:17
 * @author: olive
 * @version: 1.0
 */
public class SaveObject {
    public static void save(Object obj) throws Exception {
        PrintWriter pw = new PrintWriter(new FileOutputStream("D:\\workspace\\java\\itcast\\bxg\\bxg_01_base\\13_unit_refelx\\src\\save.txt"));
        Class<?> aClass = obj.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        String simpleName = aClass.getSimpleName();
        pw.println("-------------------" + simpleName + "----------------");
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            String name = declaredField.getName();
            Object value = declaredField.get(obj);
            pw.println(name + ":" + value);
        }
        pw.close();

    }
}
