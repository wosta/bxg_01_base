package com.olive.d2_package_modify.zi;

import com.olive.d2_package_modify.Fu;

/**
 * @author olive
 * @version 1.0
 * @date Created in 2022/10/30 12:10
 * @modified By
 */
public class Test {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.publicMethod();

        Fu fu = new Fu();
        fu.publicMethod();

        String s = "abc";
        StringBuffer  abc = new StringBuffer ("abc");
        System.out.println(abc.toString().equals(s));

        boolean equals = s.equals(abc);
        System.out.println(equals);

        StringBuffer abc1 = new StringBuffer ("abc");
        System.out.println(abc.equals(abc1));


    }
}
