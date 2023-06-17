package collection230611.set;

import java.util.Set;
import java.util.TreeSet;

/**
 * @description: Demo01
 * @date: 2023/6/14 21:50
 * @author: olive
 * @version: 1.0
 */
public class Demo01 {
    public static void main(String[] args) {
        /*
         需求：请自行选择比较器排序和自然排序两种方式；
            要求：存入四个字符串， “c”, “ab”, “df”, “qwer”
            按照长度排序，如果一样长则按照首字母排序

            采取第二种排序方式：比较器排序
        */

        Set<String> ts = new TreeSet<>((o1, o2) -> {
            int i = o1.length() - o2.length();
            return i == 0 ? o1.compareTo(o2) : i;
        });
        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");

        for (String t : ts) {
            System.out.print(t + " ");
        }
    }
}
