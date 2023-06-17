package collection230611.test;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @description: Animals
 * @date: 2023/6/13 22:21
 * @author: olive
 * @version: 1.0
 */
@Getter
@Setter
@ToString
public abstract class Animals {
    private String name;
    private int age;

    public Animals() {
    }

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void eat();
}
