package com.olive.search;

import javax.sound.midi.MidiDevice;

/**
 * @author olive
 * @version 1.0
 * @date Created in 2023/5/17 20:55
 * @modified By
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        System.out.println(binarySearch(arr, 100));
    }

    public static int binarySearch(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;
        while (true) {
            if (start > end) {
                return -1;
            }
            int middle = (start + end) >> 1;
            if (arr[middle] > num) {
                end = middle -1;
            }else if (arr[middle] < num) {
                start = middle + 1;
            }else {
                return middle;
            }
        }
    }
}
