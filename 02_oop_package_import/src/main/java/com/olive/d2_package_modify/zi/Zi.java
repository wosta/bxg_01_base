package com.olive.d2_package_modify.zi;

import com.olive.d2_package_modify.Fu;

/**
 * @author olive
 * @version 1.0
 * @date Created in 2022/10/30 12:09
 * @modified By
 */
public class Zi extends Fu {
    public static void main(String[] args) {
        Fu fu = new Fu();
        fu.publicMethod();

        Zi zi = new Zi();
        zi.protectedMethod();
        zi.publicMethod();
    }
}
