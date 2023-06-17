package collection230611.set;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @description: Student
 * @date: 2023/6/14 22:04
 * @author: olive
 * @version: 1.0
 */
@Getter
@Setter
@ToString
public class Student {
    private String name;
    private int age;
    private int chineseScore;
    private int englishScore;
    private int mathScore;

    public Student(String name, int age, int chineseScore, int englishScore, int mathScore) {
        this.name = name;
        this.age = age;
        this.chineseScore = chineseScore;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }

    public int getSum() {
        return this.chineseScore + this.mathScore + this.englishScore;
    }
}
