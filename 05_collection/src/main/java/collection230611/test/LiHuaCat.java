package collection230611.test;

/**
 * @description: LIHuaCat
 * @date: 2023/6/13 22:44
 * @author: olive
 * @version: 1.0
 */
public class LiHuaCat extends Cat{
    @Override
    void eat() {
        System.out.println("一只叫做" + getName() + "的，" + getAge() + "岁的狸花猫，正在吃鱼");
    }
}
