package myfunction2330719;

import java.util.Arrays;

/**
 * @description: Demo01
 * @date: 2023/7/19 21:59
 * @author: olive
 * @version: 1.0
 */
public class Demo01 {
    public static void main(String[] args) {
        //需求：创建一个数组，进行倒序排列
        Integer[] arr = {3, 5, 4, 1, 6, 2};
        Arrays.sort(arr, Demo01::compare);
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
    }

    public static int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
