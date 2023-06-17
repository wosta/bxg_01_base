package collection230611.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: Demo
 * @date: 2023/6/13 22:19
 * @author: olive
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        /*
        需求：
                定义一个继承结构：
                                    动物
                         |                           |
                         猫                          狗
                      |      |                    |      |
                   波斯猫   狸花猫                泰迪   哈士奇
                 属性：名字，年龄
                 行为：吃东西
                       波斯猫方法体打印：一只叫做XXX的，X岁的波斯猫，正在吃小饼干
                       狸花猫方法体打印：一只叫做XXX的，X岁的狸花猫，正在吃鱼
                       泰迪方法体打印：一只叫做XXX的，X岁的泰迪，正在吃骨头，边吃边蹭
                       哈士奇方法体打印：一只叫做XXX的，X岁的哈士奇，正在吃骨头，边吃边拆家

            测试类中定义一个方法用于饲养动物
                public static void keepPet(ArrayList<???> list){
                    //遍历集合，调用动物的eat方法
                }
            要求1：该方法能养所有品种的猫，但是不能养狗
            要求2：该方法能养所有品种的狗，但是不能养猫
            要求3：该方法能养所有的动物，但是不能传递其他类型
         */
        ArrayList<Cat> list = new ArrayList<>();
        ArrayList<LiHuaCat> liHuaCats = new ArrayList<>();
        ArrayList<TeddyDog> teddyDogs = new ArrayList<>();

        keepPet(liHuaCats);
    }

    public static void keepPet(ArrayList<? extends Cat> list) {

    }
}
