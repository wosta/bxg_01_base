package com.olive.map230628;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @description: Demo01
 * @date: 2023/6/28 22:38
 * @author: olive
 * @version: 1.0
 */
public class Demo01 {
    public static void main(String[] args) {
        HashMap<Student, String> hm = new HashMap<>();

        //2.创建三个学生对象
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);
        Student s4 = new Student("wangwu", 25);

        hm.put(s1, "江苏");
        hm.put(s2, "浙江");
        hm.put(s3, "福建");
        hm.put(s4, "山东");

//        hm.forEach((stu, s) -> {
//            System.out.println(stu.toString() + " " + s);
//        });

        Set<Student> students = hm.keySet();
        for (Student stu : students) {
            System.out.println(stu.toString() + " " + hm.get(stu));
        }

        System.out.println();

        Set<Map.Entry<Student, String>> entries = hm.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            System.out.println(key + " " + hm.get(key));
        }
    }
}
