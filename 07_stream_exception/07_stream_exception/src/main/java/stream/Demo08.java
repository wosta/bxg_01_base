package stream;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;

/**
 * @description: Demo08
 * @date: 2023/6/18 14:59
 * @author: olive
 * @version: 1.0
 */
public class Demo08 {
    public static void main(String[] args) {
        /**要求：
         *       获取姓名并放到数组当中
         *       使用方法引用完成
         */
        ArrayList<Student> list = new ArrayList<>();
        //2.添加元素
        list.add(new Student("zhangsan",23));
        list.add(new Student("lisi",24));
        list.add(new Student("wangwu", 25));
        String[] array = list.stream().map(Student::getName).toArray(String[]::new);
        System.out.println(JSON.toJSONString(array));
    }
}
