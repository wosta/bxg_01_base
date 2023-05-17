package com.olive;

/**
 * @author olive
 * @version 1.0
 * @date Created in 2023/1/15 21:19
 * @modified By
 */
public class Person {
    public String name;
    private int age;
    private int count;

    private Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void show() {
        System.out.println("public show method");
    }

    private String showName(){
        return this.name;
    }
}
