package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @description: Demo03
 * @date: 2023/6/18 9:56
 * @author: olive
 * @version: 1.0
 */
public class Demo03 {
    public static void main(String[] args) {
        /*
        方法引用（引用成员方法）
        格式
                其他类：其他类对象::方法名
                本类：this::方法名(引用处不能是静态方法)
                父类：super::方法名(引用处不能是静态方法)
        需求：
            集合中有一些名字，按照要求过滤数据
            数据："张无忌","周芷若","赵敏","张强","张三丰"
            要求：只要以张开头，而且名字是3个字的
       */
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰");
        Demo03 d = new Demo03();
        list.stream().filter(d::filter).forEach(System.out::println);
    }

    private boolean filter(String x) {
        return x.startsWith("张") && x.length() == 3;
    }
}
