package stream;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @description: Demo07
 * @date: 2023/6/18 14:56
 * @author: olive
 * @version: 1.0
 */
public class Demo07 {
    public static void main(String[] args) {
         /*
        需求：
             集合中存储一些字符串的数据，比如：张三,23。
             收集到Student类型的数组当中
       */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌,15", "周芷若,14", "赵敏,13", "张强,20", "张三丰,100", "张翠山,40", "张良,35", "王二麻子,37", "谢广坤,41");
        Student[] array = list.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(JSON.toJSONString(array));
    }
}
