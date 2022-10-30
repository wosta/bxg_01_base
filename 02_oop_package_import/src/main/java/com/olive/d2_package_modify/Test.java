package com.olive.d2_package_modify;

import com.olive.d2_package_modify.zi.Zi;
import com.sun.org.apache.xpath.internal.operations.String;

/**
 * @author olive
 * @version 1.0
 * @date Created in 2022/10/30 12:09
 * @modified By
 */
public class Test {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.protectedMethod();
        zi.publicMethod();

        Fu fu = new Fu();
        fu.defaultMethod();
        fu.protectedMethod();
        fu.publicMethod();

        String string = new String();
        string.toString();

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.toString();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.toString();



    }
}
