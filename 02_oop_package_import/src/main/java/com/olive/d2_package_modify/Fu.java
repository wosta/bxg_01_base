package com.olive.d2_package_modify;

/**
 * @author olive
 * @version 1.0
 * @date Created in 2022/10/30 12:05
 * @modified By
 */
public class Fu {
    private void pMethod() {
        System.out.println("private method..");
    }

    void defaultMethod() {
        System.out.println("default method...");
    }

    protected void protectedMethod() {
        System.out.println("protected method...");
    }

    public void publicMethod() {
        System.out.println("public method...");
    }

    public static void main(String[] args) {
        Fu fu = new Fu();
        fu.pMethod();
        fu.defaultMethod();
        fu.protectedMethod();
        fu.publicMethod();
    }
}
