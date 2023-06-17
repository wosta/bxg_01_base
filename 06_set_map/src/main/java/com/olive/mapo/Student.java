package com.olive.mapo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @description: Student
 * @date: 2023/6/15 21:35
 * @author: olive
 * @version: 1.0
 */
@Getter
@Setter
@ToString
public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Student o) {
        int i = o.age - this.age;
        return i == 0 ? o.name.compareTo(this.name) : i;
    }
}
