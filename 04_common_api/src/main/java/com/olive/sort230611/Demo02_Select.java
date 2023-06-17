package com.olive.sort230611;

/**
 * @description: Demo02
 * @date: 2023/6/11 15:27
 * @author: olive
 * @version: 1.0
 */
public class Demo02_Select {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 8, 3, 1, 9, 7, 6};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
