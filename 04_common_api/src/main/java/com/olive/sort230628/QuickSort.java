package com.olive.sort230628;

/**
 * @description: QuickSort
 * @date: 2023/6/28 21:20
 * @author: olive
 * @version: 1.0
 */
public class QuickSort {
    public static void main(String[] args) {

        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int[] arr, int left, int right) {
        int begin = left;
        int end = right;
        if (left > right) {
            return;
        }
        int pivot = arr[left];

        while (begin != end) {
            while (true) {
                if (begin >= end || arr[end] < pivot) {
                    break;
                }
                end--;
            }
            while (true) {
                if (begin >= end || arr[begin] > pivot) {
                    break;
                }
                begin++;
            }
            int temp = arr[begin];
            arr[begin] = arr[end];
            arr[end] = temp;
        }
        int temp = arr[left];
        arr[left] = arr[begin];
        arr[begin] = temp;

        quickSort(arr, left, begin - 1);
        quickSort(arr, begin + 1, right);
    }
}
