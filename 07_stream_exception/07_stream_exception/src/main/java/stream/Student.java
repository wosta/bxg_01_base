package stream;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @description: Student
 * @date: 2023/6/18 10:24
 * @author: olive
 * @version: 1.0
 */
@Getter
@Setter
@ToString
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String s) {
        String[] split = s.split(",");
        this.name = split[0];
        this.age = Integer.parseInt(split[1]);
    }
}
