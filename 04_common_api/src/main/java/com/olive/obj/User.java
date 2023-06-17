package com.olive.obj;

import java.util.Arrays;

/**
 * @description: User
 * @date: 2023/6/11 12:36
 * @author: olive
 * @version: 1.0
 */
public class User implements Cloneable{
    private String name;
    private int age;
    private int[] scores;

    @Override
    public User clone() {
        try {
            User clone = (User) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
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

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", scores=" + Arrays.toString(scores) +
                '}';
    }
}
