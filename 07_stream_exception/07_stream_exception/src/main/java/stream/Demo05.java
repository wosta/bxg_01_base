package stream;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @description: Demo05
 * @date: 2023/6/18 11:08
 * @author: olive
 * @version: 1.0
 */
public class Demo05 {
    public static void main(String[] args) {
        /*
        方法引用（类名引用成员方法）
        格式
                类名::成员方法
        需求：
             集合里面一些字符串，要求变成大写后进行输出
         */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aaa", "bbb", "ccc", "ddd");
        list.stream().map(String::toUpperCase).forEach(System.out::println);

    }
}
