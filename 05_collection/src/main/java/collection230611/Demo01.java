package collection230611;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @description: Demo01
 * @date: 2023/6/11 21:48
 * @author: olive
 * @version: 1.0
 */
public class Demo01 {
    public static void main(String[] args) {
        Student student1 = new Student().setName("zs").setAge(18);
        Student student2 = new Student().setName("ls").setAge(19);
        Student student3 = new Student().setName("ww").setAge(20);
        Collection<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        System.out.println(list);
        Student student4 = new Student().setAge(20).setName("ww");
        boolean contains = list.contains(student4);
        System.out.println("contains = " + contains);
    }
}
