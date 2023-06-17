package collection230611;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @description: Demo02
 * @date: 2023/6/12 22:12
 * @author: olive
 * @version: 1.0
 */
public class Demo02 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

//        for (String s : coll) {
//            System.out.println(s);
//        }

        Iterator<String> iterator = coll.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        coll.stream().forEach(x-> {
            System.out.println(x);
        });
    }
}
