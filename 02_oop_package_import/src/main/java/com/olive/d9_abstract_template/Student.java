package com.olive.d9_abstract_template;

/**
 * @author olive
 * @version 1.0
 * @date Created in 2022/10/30 16:14
 * @modified By
 */
public abstract class Student {
    abstract void write();

    public final void test() {
        begin();
        write();
        end();
    }

    private void begin() {
        System.out.println("这是一个好的开头");
    }

    private void end() {
        System.out.println("这是一个好的结尾..");
    }
}
