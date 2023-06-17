package com.olive.sort230611;

/**
 * @description: Demo04_Quick
 * @date: 2023/6/11 16:17
 * @author: olive
 * @version: 1.0
 */
public class Demo04_Quick {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        quickSort01(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int[] arr, int i, int j) {
//        int left = i;
//        int right = j;
//        if (left > right) {
//            return;
//        }
//        int baseNum = arr[left];
////        while (left < right) {
//        while (left != right) {
//            while (left <= right && arr[right] > baseNum) {
//                right--;
//            }
//            while (left <= right && arr[left] <= baseNum) {
//                left++;
//            }
//            int temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//        }
//        int temp = arr[left];
//        arr[left] = arr[i];
//        arr[i] = temp;
//
//        quickSort(arr, i, left - 1);
//        quickSort(arr, left + 1, j);

        int start = i;
        int end = j;
        if(start > end){
            //递归的出口
            return;
        }
        //记录基准数
        int baseNumber = arr[i];
        //利用循环找到要交换的数字
        while(start < end){
            //利用end，从后往前开始找，找比基准数小的数字
            //int[] arr = {1, 6, 2, 7, 9, 3, 4, 5, 10, 8};
            while(true){
                if(end <= start || arr[end] < baseNumber){
                    break;
                }
                end--;
            }
            //利用start，从前往后找，找比基准数大的数字
            while(true){
                if(end <= start || arr[start] > baseNumber){
                    break;
                }
                start++;
            }
            //把end和start指向的元素进行交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        //当start和end指向了同一个元素的时候，那么上面的循环就会结束
        //表示已经找到了基准数在数组中应存入的位置
        //基准数归位
        //就是拿着这个范围中的第一个数字，跟start指向的元素进行交换
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        //确定6左边的范围，重复刚刚所做的事情
        quickSort(arr,i,start - 1);
        //确定6右边的范围，重复刚刚所做的事情
        quickSort(arr,start + 1,j);

    }

    public static void quickSort01(int[] arr, int i, int j) {
        int left = i;
        int right = j;
        if (left > right) {
            return ;
        }
        int baseNum = arr[i];
        while (left < right) {
            while (true) {
                if (left >= right || arr[right] < baseNum) {
                    break;
                }
                right--;
            }
            while (true) {
                if (left >= right || arr[left] > baseNum) {
                    break;
                }
                left++;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        int tem = arr[left];
        arr[left] = arr[i];
        arr[i] = tem;

        quickSort(arr, 0, left - 1);
        quickSort(arr, left + 1, j);
    }
}
