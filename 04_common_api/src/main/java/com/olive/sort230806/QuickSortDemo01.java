package com.olive.sort230806;

/**
 * @description: QuickSortDemo01
 * @date: 2023/8/6 15:17
 * @author: olive
 * @version: 1.0
 */
public class QuickSortDemo01 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7, 8, 9, 6, 11, 2, 10, 16};
        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void quickSort(int[] arr, int i, int j) {
        int left = i;
        int right = j;

        if (right < left) {
            return;
        }
        int base = arr[i];
        while (left != right) {
            while (true) {
                if (right <= left || arr[right] < base) {
                    break;
                }
                right--;
            }
            while (true) {
                if (right <= left || arr[left] > base) {
                    break;
                }
                left++;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        int tem = arr[i];
        arr[i] = arr[left];
        arr[left] = tem;

        quickSort(arr, 0, left - 1);
        quickSort(arr, left + 1, j);
    }
}
