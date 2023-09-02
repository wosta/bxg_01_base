package stream230712;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @description: Demo06
 * @date: 2023/7/12 22:04
 * @author: olive
 * @version: 1.0
 */
public class Demo06 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");
        list.stream().filter(x -> x.startsWith("张")).limit(2).forEach(System.out::println);
        list.stream().filter(x -> x.startsWith("张")).skip(2).forEach(System.out::println);
    }
}
