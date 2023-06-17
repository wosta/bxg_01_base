package collection230611.set;


import com.alibaba.fastjson.JSON;

import java.util.List;
import java.util.TreeSet;

/**
 * @description: Deme02
 * @date: 2023/6/14 22:05
 * @author: olive
 * @version: 1.0
 */
public class Demo02 {
     /*  需求：创建5个学生对象
        属性：(姓名,年龄，语文成绩,数学成绩,英语成绩),
        按照总分从高到低输出到控制台
        如果总分一样，按照语文成绩排
        如果语文一样，按照数学成绩排
        如果数学成绩一样，按照英语成绩排
        如果英文成绩一样，按照年龄排
        如果年龄一样，按照姓名的字母顺序排
        如果都一样，认为是同一个学生，不存。
        第一种：默认排序/自然排序
        第二种：比较器排序
        默认情况下，用第一种排序方式，如果第一种不能满足当前的需求，采取第二种方式。
        课堂练习：
            要求：在遍历集合的时候，我想看到总分。
      */
     public static void main(String[] args) {
         Student s1 = new Student("zhangsan",23,90,99,50);
         Student s2 = new Student("lisi",24,90,98,50);
         Student s3 = new Student("wangwu",25,95,100,30);
         Student s4 = new Student("zhaoliu",26,60,99,70);
         Student s5 = new Student("qianqi",26,70,80,70);

         TreeSet<Student> ts = new TreeSet<>((o1, o2) -> {
             //比较两者的总分
             int i = o1.getSum() - o2.getSum();
             //如果总分一样，就按照语文成绩排序
             i = i == 0 ? o1.getChineseScore() - o2.getChineseScore() : i;
             //如果语文成绩一样，就按照数学成绩排序
             i = i == 0 ? o1.getMathScore() - o2.getMathScore() : i;
             //如果数学成绩一样，按照英语成绩排序（可以省略不写）
             i = i == 0 ? o1.getEnglishScore() - o2.getEnglishScore() : i;
             //如果英文成绩一样，按照年龄排序
             i = i == 0 ? o1.getAge() - o2.getAge() : i;
             //如果年龄一样，按照姓名的字母顺序排序
             i = i == 0 ? o1.getName().compareTo(o2.getName()) : i;
             return i;
         });

         ts.add(s1);
         ts.add(s2);
         ts.add(s3);
         ts.add(s4);
         ts.add(s5);

         System.out.println(JSON.toJSONString(ts, true));
     }
}
