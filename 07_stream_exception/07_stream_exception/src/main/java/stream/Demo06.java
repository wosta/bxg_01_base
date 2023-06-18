package stream;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @description: Demo06
 * @date: 2023/6/18 11:09
 * @author: olive
 * @version: 1.0
 */
public class Demo06 {
    public static void main(String[] args) {
        /*
        方法引用（数组的构造方法）
        格式
                数据类型[]::new
        目的：
                创建一个指定类型的数组
        需求：
             集合中存储一些整数，收集到数组当中
        细节：
            数组的类型，需要跟流中数据的类型保持一致。
       */
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5);
        Integer[] array = list.stream().toArray(Integer[]::new);
        System.out.println(JSON.toJSONString(array));

    }
}
