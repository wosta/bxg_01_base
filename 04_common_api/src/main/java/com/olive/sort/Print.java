package com.olive.sort;

/**
 * @author olive
 * @version 1.0
 * @date Created in 2023/5/17 21:07
 * @modified By
 */
public class Print {
    public static void printNum(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
            }
        System.out.println("]");
    }
}
