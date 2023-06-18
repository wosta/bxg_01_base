package stream;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args){
        //需求：创建一个数组，进行倒序排列
        Integer[] arr = {3, 5, 4, 1, 6, 2};
//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });

//        Arrays.sort(arr, (o1, o2) -> o2 - o1);

        Arrays.sort(arr, Demo01::subInt);

        System.out.println("arr = " + JSON.toJSONString(arr));


    }

    public static int subInt(int o1, int o2) {
        return o2 - o1;
    }
}