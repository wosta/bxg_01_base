package com.olive.sort230611;

/**
 * @description: Demo01
 * @date: 2023/6/11 14:41
 * @author: olive
 * @version: 1.0
 */
public class Demo01_Bubble {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 8, 3, 1, 9, 7, 6};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
