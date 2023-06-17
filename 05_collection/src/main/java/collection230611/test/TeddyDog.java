package collection230611.test;

/**
 * @description: Teddy
 * @date: 2023/6/13 22:25
 * @author: olive
 * @version: 1.0
 */
public class TeddyDog extends Dog{
    @Override
    void eat() {
        System.out.println("一只叫做"+this.getName()+"的，"+this.getAge()+"岁的泰迪，正在吃骨头，边吃边蹭");
    }
}
