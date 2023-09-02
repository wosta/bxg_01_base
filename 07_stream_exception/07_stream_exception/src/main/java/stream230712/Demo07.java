package stream230712;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * @description: Demo07
 * @date: 2023/7/12 22:12
 * @author: olive
 * @version: 1.0
 */
public class Demo07 {
    public static void main(String[] args) {
        /* concat  distinct */
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "张无忌", "张无忌", "张无忌", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");
//        list1.stream().distinct().forEach(System.out::println);

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "赵敏", "周芷若");

        Stream.concat(list1.stream(), list2.stream()).forEach(System.out::println);
    }
}
