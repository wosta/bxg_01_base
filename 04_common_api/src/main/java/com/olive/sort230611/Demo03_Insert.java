package com.olive.sort230611;

/**
 * @description: Demo03
 * @date: 2023/6/11 15:53
 * @author: olive
 * @version: 1.0
 */
public class Demo03_Insert {
    public static void main(String[] args) {
        /*插入排序*/
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        int startIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                startIndex = i + 1;
                break;
            }
        }
        for (int i = startIndex; i < arr.length; i++) {
            // 这里是重点
            startIndex = i;
            while (startIndex > 0) {
                if (arr[startIndex] < arr[startIndex - 1]) {
                    int temp = arr[startIndex -1];
                    arr[startIndex - 1] = arr[startIndex];
                    arr[startIndex] = temp;
                }
                startIndex--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
