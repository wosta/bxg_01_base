package com.olive.search230611;

/**
 * @description: BinarySearch
 * @date: 2023/6/11 14:01
 * @author: olive
 * @version: 1.0
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        System.out.println(binarySearch(arr, 4));
    }

    private static int binarySearch(int[] arr, int num) {
        int index = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = (start + end) >> 1;
            if (arr[middle] < num) {
                start = middle + 1;
            } else if (arr[middle] > num) {
                end = middle - 1;
            } else {
                index = middle;
                break;
            }
        }
        return index;
    }
}
