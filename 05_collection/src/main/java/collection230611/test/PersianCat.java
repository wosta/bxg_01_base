package collection230611.test;

/**
 * @description: PersianCat
 * @date: 2023/6/13 22:44
 * @author: olive
 * @version: 1.0
 */
public class PersianCat extends Cat {
    @Override
    public void eat() {
        System.out.println("一只叫做" + getName() + "的，" + getAge() + "岁的波斯猫，正在吃小饼干");
    }
}
