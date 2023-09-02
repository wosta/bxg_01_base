package com.olive.map230628;

import java.util.Objects;

/**
 * @description: Student
 * @date: 2023/6/28 22:40
 * @author: olive
 * @version: 1.0
 */
public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return this.age == student.age && Objects.equals(this.name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + this.name + '\'' +
                ", age=" + this.age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int i = o.age - this.age;
        return i == 0 ? o.name.compareTo(this.name) : i;
    }
}
