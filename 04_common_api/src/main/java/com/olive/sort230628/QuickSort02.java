package com.olive.sort230628;

/**
 * @description: QuickSort02
 * @date: 2023/6/28 21:39
 * @author: olive
 * @version: 1.0
 */
public class QuickSort02 {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void quickSort(int[] arr, int i, int j) {
        int left = i;
        int right = j;
        if (left > right) {
            return;
        }
        int pivot = arr[left];
        while (left < right) {
            while (true) {
                if (left < right && arr[right] >= pivot) {
                    right--;
                } else {
                    break;
                }
            }
            while (true) {
                if (left < right && arr[left] <= pivot) {
                    left++;
                } else {
                    break;
                }
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        int temp = arr[i];
        arr[i] = arr[left];
        arr[left] = temp;

        quickSort(arr, i, left - 1);
        quickSort(arr, left + 1, j);
    }
}
