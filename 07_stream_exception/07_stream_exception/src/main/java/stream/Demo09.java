package stream;

import java.util.ArrayList;
import java.util.function.Function;

/**
 * @description: Demo09
 * @date: 2023/6/18 15:01
 * @author: olive
 * @version: 1.0
 */
public class Demo09 {
    public static void main(String[] args) {
        /**要求：
         *       把姓名和年龄拼接成：张三-23的字符串，并放到数组当中
         *       使用方法引用完成
         */
        ArrayList<Student> list = new ArrayList<>();
        //2.添加元素
        list.add(new Student("zhangsan",23));
        list.add(new Student("lisi",24));
        list.add(new Student("wangwu", 25));
        list.stream().map(new Demo09()::apply).forEach(System.out::println);
    }

    public String apply(Student student) {
        return student.getName()+"-"+student.getAge();
    }
}
