package com.olive.sort;

/**
 * @author olive
 * @version 1.0
 * @date Created in 2023/5/17 21:05
 * @modified By
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 3, 1, 7, 9, 6};
        Print.printNum(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        Print.printNum(arr);
    }
}
