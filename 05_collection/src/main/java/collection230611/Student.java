package collection230611;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @description: Student
 * @date: 2023/6/11 21:49
 * @author: olive
 * @version: 1.0
 */
@Data
@Accessors(chain = true)
public class Student {
    private String name;
    private int age;

}
