package immutable230719;


import java.util.List;

/**
 * @description: Demo01
 * @date: 2023/7/19 21:54
 * @author: olive
 * @version: 1.0
 */
public class Demo01 {
    public static void main(String[] args) {
        List<String> of = List.of("张三", "李四", "王五", "赵六");
        System.out.println(of);
        of.add("朱七");
    }
}
