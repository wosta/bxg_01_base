package stream;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description: Demo02
 * @date: 2023/6/17 11:46
 * @author: olive
 * @version: 1.0
 */
public class Demo02 {
    public static void main(String[] args) {
        /*
        方法引用（引用静态方法）
        格式
              类::方法名
        需求：
            集合中有以下数字，要求把他们都变成int类型
            "1","2","3","4","5"
       */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4", "5");

//        list.stream().map(Integer::parseInt).forEach(x -> System.out.println(x + 1));
        list.stream().map(Demo02::convert).forEach(System.out::println);
    }

    public static int convert(String s) {
        return Integer.parseInt(s);
    }
}
