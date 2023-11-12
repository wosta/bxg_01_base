package com.olive.proxy.Demo;

/**
 * @description: UserServiceImpl
 * @date: 2023/11/4 16:16
 * @author: olive
 * @version: 1.0
 */
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("用户添加成功！");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete() {
        System.out.println("用户删除成功");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void select() {
        System.out.println("查询成功");
        try {
            Thread.sleep(2222);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
