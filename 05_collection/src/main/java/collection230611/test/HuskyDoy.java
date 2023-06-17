package collection230611.test;

/**
 * @description: HuskyDoy
 * @date: 2023/6/13 22:41
 * @author: olive
 * @version: 1.0
 */
public class HuskyDoy extends Dog {

    @Override
    void eat() {
        System.out.println("一只叫做" + getName() + "的，" + getAge() + "岁的哈士奇，正在吃骨头，边吃边拆家");
    }
}
