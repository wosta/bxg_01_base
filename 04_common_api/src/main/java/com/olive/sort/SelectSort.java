package com.olive.sort;

/**
 * @author olive
 * @version 1.0
 * @date Created in 2023/5/17 21:17
 * @modified By
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 1, 7, 9, 6};
        Print.printNum(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        Print.printNum(arr);
    }
}
